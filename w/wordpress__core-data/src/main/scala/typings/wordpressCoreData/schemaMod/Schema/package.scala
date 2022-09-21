package typings.wordpressCoreData.schemaMod.Schema

import org.scalablytyped.runtime.TopLevel
import typings.std.Partial
import typings.std.Pick
import typings.wordpressCoreData.anon.Raw
import typings.wordpressCoreData.anon.Rendered
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


// prettier-ignore
type Block[T /* <: Context */] = BaseBlock[T] | (Pick[
BaseBlock[T], 
typings.wordpressCoreData.schemaMod.Schema.ViewKeys.Block | typings.wordpressCoreData.schemaMod.Schema.EmbedKeys.Block])

// prettier-ignore
type Comment[T /* <: Context */] = BaseComment[T] | (Pick[
BaseComment[T], 
typings.wordpressCoreData.schemaMod.Schema.ViewKeys.Comment | typings.wordpressCoreData.schemaMod.Schema.EmbedKeys.Comment])

type Contextual[T /* <: Context */, TAdditional, TEditAdditional] = (Rendered & TAdditional) | (Raw & TAdditional & TEditAdditional)

type Decontextualize[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ k in keyof T ]: T[k] extends @wordpress/core-data.@wordpress/core-data/schema.Schema.Contextual<any, {}, {}>? string : T[k]}
  */ typings.wordpressCoreData.wordpressCoreDataStrings.Decontextualize & TopLevel[Any]

// prettier-ignore
type Media[T /* <: Context */] = BaseMedia[T] | (Pick[
BaseMedia[T], 
typings.wordpressCoreData.schemaMod.Schema.ViewKeys.Media | typings.wordpressCoreData.schemaMod.Schema.EmbedKeys.Media])

// prettier-ignore
type Page[T /* <: Context */] = BasePage[T] | (Pick[
BasePage[T], 
typings.wordpressCoreData.schemaMod.Schema.ViewKeys.Page | typings.wordpressCoreData.schemaMod.Schema.EmbedKeys.Page])

// prettier-ignore
type Post[T /* <: Context */] = BasePost[T] | (Pick[
BasePost[T], 
typings.wordpressCoreData.schemaMod.Schema.ViewKeys.Post | typings.wordpressCoreData.schemaMod.Schema.EmbedKeys.Post])

// prettier-ignore
type PostOrPage[T /* <: Context */] = (BasePost[T] & Partial[BasePage[T]]) | ((Pick[BasePost[T], typings.wordpressCoreData.schemaMod.Schema.ViewKeys.Post]) & (Partial[Pick[BasePage[T], typings.wordpressCoreData.schemaMod.Schema.ViewKeys.Page]])) | ((Pick[BasePost[T], typings.wordpressCoreData.schemaMod.Schema.EmbedKeys.Post]) & (Partial[Pick[BasePage[T], typings.wordpressCoreData.schemaMod.Schema.EmbedKeys.Page]]))

// prettier-ignore
type PostRevision[T /* <: Context */] = BasePostRevision[T] | (Pick[
BasePostRevision[T], 
typings.wordpressCoreData.schemaMod.Schema.ViewKeys.PostRevision | typings.wordpressCoreData.schemaMod.Schema.EmbedKeys.PostRevision])

// prettier-ignore
type Taxonomy[T /* <: Context */] = BaseTaxonomy[T] | (Pick[
BaseTaxonomy[T], 
typings.wordpressCoreData.schemaMod.Schema.ViewKeys.Taxonomy | typings.wordpressCoreData.schemaMod.Schema.EmbedKeys.Taxonomy])

// prettier-ignore
type Type[T /* <: Context */] = BaseType[T] | (Pick[
BaseType[T], 
typings.wordpressCoreData.schemaMod.Schema.ViewKeys.Type | typings.wordpressCoreData.schemaMod.Schema.EmbedKeys.Type])

// prettier-ignore
type User[T /* <: Context */] = BaseUser[T] | (Pick[
BaseUser[T], 
typings.wordpressCoreData.schemaMod.Schema.ViewKeys.User | typings.wordpressCoreData.schemaMod.Schema.EmbedKeys.User])
