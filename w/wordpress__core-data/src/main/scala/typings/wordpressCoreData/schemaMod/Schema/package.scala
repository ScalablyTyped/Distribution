package typings.wordpressCoreData.schemaMod.Schema

import typings.std.Partial
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


// prettier-ignore
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends 'embed' ? std.Pick<@wordpress/core-data.@wordpress/core-data/schema.Schema.BaseBlock<T>, @wordpress/core-data.@wordpress/core-data/schema.Schema.EmbedKeys.Block> : T extends 'view' ? std.Pick<@wordpress/core-data.@wordpress/core-data/schema.Schema.BaseBlock<T>, @wordpress/core-data.@wordpress/core-data/schema.Schema.ViewKeys.Block> : @wordpress/core-data.@wordpress/core-data/schema.Schema.BaseBlock<T>
  }}}
  */
type Block[T /* <: Context */] = Pick[BaseBlock[T], typings.wordpressCoreData.schemaMod.Schema.EmbedKeys.Block]

// prettier-ignore
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends 'embed' ? / * Inlined std.Pick<@wordpress/core-data.@wordpress/core-data/schema.Schema.BaseCategory, @wordpress/core-data.@wordpress/core-data/schema.Schema.EmbedKeys.Category> * /
{  taxonomy :@wordpress/core-data.@wordpress/core-data/schema.Schema.TaxonomyKind,   _embedded :std.Record<string, std.Array<any>> | undefined | undefined,   _links :std.Record<string, std.Array<{  href :string, [k: string] : any}>>,   slug :string,   name :string,   id :number,   link :string} : T extends 'view' ? / * Inlined std.Pick<@wordpress/core-data.@wordpress/core-data/schema.Schema.BaseCategory, @wordpress/core-data.@wordpress/core-data/schema.Schema.ViewKeys.Category> * /
{  description :string,   meta :std.Array<any>,   taxonomy :@wordpress/core-data.@wordpress/core-data/schema.Schema.TaxonomyKind,   _embedded :std.Record<string, std.Array<any>> | undefined | undefined,   _links :std.Record<string, std.Array<{  href :string, [k: string] : any}>>,   parent :number,   slug :string,   count :number,   name :string,   id :number,   link :string} : @wordpress/core-data.@wordpress/core-data/schema.Schema.BaseCategory
  }}}
  */
type Category[T /* <: Context */] = BaseCategory

// prettier-ignore
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends 'embed' ? std.Pick<@wordpress/core-data.@wordpress/core-data/schema.Schema.BaseComment<T>, @wordpress/core-data.@wordpress/core-data/schema.Schema.EmbedKeys.Comment> : T extends 'view' ? std.Pick<@wordpress/core-data.@wordpress/core-data/schema.Schema.BaseComment<T>, @wordpress/core-data.@wordpress/core-data/schema.Schema.ViewKeys.Comment> : @wordpress/core-data.@wordpress/core-data/schema.Schema.BaseComment<T>
  }}}
  */
type Comment[T /* <: Context */] = Pick[BaseComment[T], typings.wordpressCoreData.schemaMod.Schema.EmbedKeys.Comment]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends 'edit' ? {  raw :string,   rendered :string} & TAdditional & TEditAdditional : {  rendered :string} & TAdditional
  }}}
  */
type Contextual[T /* <: Context */, TAdditional, TEditAdditional] = (/* import warning: importer.ImportType#apply Failed type conversion: {  raw :string,   rendered :string} */ js.Any) & TAdditional & TEditAdditional

// prettier-ignore
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends 'embed' ? std.Pick<@wordpress/core-data.@wordpress/core-data/schema.Schema.BaseMedia<T>, @wordpress/core-data.@wordpress/core-data/schema.Schema.EmbedKeys.Media> : T extends 'view' ? std.Pick<@wordpress/core-data.@wordpress/core-data/schema.Schema.BaseMedia<T>, @wordpress/core-data.@wordpress/core-data/schema.Schema.ViewKeys.Media> : @wordpress/core-data.@wordpress/core-data/schema.Schema.BaseMedia<T>
  }}}
  */
type Media[T /* <: Context */] = Pick[BaseMedia[T], typings.wordpressCoreData.schemaMod.Schema.EmbedKeys.Media]

// prettier-ignore
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends 'embed' ? std.Pick<@wordpress/core-data.@wordpress/core-data/schema.Schema.BasePage<T>, @wordpress/core-data.@wordpress/core-data/schema.Schema.EmbedKeys.Page> : T extends 'view' ? std.Pick<@wordpress/core-data.@wordpress/core-data/schema.Schema.BasePage<T>, @wordpress/core-data.@wordpress/core-data/schema.Schema.ViewKeys.Page> : @wordpress/core-data.@wordpress/core-data/schema.Schema.BasePage<T>
  }}}
  */
type Page[T /* <: Context */] = Pick[BasePage[T], typings.wordpressCoreData.schemaMod.Schema.EmbedKeys.Page]

// prettier-ignore
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends 'embed' ? std.Pick<@wordpress/core-data.@wordpress/core-data/schema.Schema.BasePost<T>, @wordpress/core-data.@wordpress/core-data/schema.Schema.EmbedKeys.Post> : T extends 'view' ? std.Pick<@wordpress/core-data.@wordpress/core-data/schema.Schema.BasePost<T>, @wordpress/core-data.@wordpress/core-data/schema.Schema.ViewKeys.Post> : @wordpress/core-data.@wordpress/core-data/schema.Schema.BasePost<T>
  }}}
  */
type Post[T /* <: Context */] = Pick[BasePost[T], typings.wordpressCoreData.schemaMod.Schema.EmbedKeys.Post]

// prettier-ignore
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends 'embed' ? std.Pick<@wordpress/core-data.@wordpress/core-data/schema.Schema.BasePost<T>, @wordpress/core-data.@wordpress/core-data/schema.Schema.EmbedKeys.Post> & std.Partial<std.Pick<@wordpress/core-data.@wordpress/core-data/schema.Schema.BasePage<T>, @wordpress/core-data.@wordpress/core-data/schema.Schema.EmbedKeys.Page>> : T extends 'view' ? std.Pick<@wordpress/core-data.@wordpress/core-data/schema.Schema.BasePost<T>, @wordpress/core-data.@wordpress/core-data/schema.Schema.ViewKeys.Post> & std.Partial<std.Pick<@wordpress/core-data.@wordpress/core-data/schema.Schema.BasePage<T>, @wordpress/core-data.@wordpress/core-data/schema.Schema.ViewKeys.Page>> : @wordpress/core-data.@wordpress/core-data/schema.Schema.BasePost<T> & std.Partial<@wordpress/core-data.@wordpress/core-data/schema.Schema.BasePage<T>>
  }}}
  */
type PostOrPage[T /* <: Context */] = (Pick[BasePost[T], typings.wordpressCoreData.schemaMod.Schema.EmbedKeys.Post]) & (Partial[Pick[BasePage[T], typings.wordpressCoreData.schemaMod.Schema.EmbedKeys.Page]])

// prettier-ignore
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends 'embed' ? std.Pick<@wordpress/core-data.@wordpress/core-data/schema.Schema.BasePostRevision<T>, @wordpress/core-data.@wordpress/core-data/schema.Schema.EmbedKeys.PostRevision> : T extends 'view' ? std.Pick<@wordpress/core-data.@wordpress/core-data/schema.Schema.BasePostRevision<T>, @wordpress/core-data.@wordpress/core-data/schema.Schema.ViewKeys.PostRevision> : @wordpress/core-data.@wordpress/core-data/schema.Schema.BasePostRevision<T>
  }}}
  */
type PostRevision[T /* <: Context */] = Pick[
BasePostRevision[T], 
typings.wordpressCoreData.schemaMod.Schema.EmbedKeys.PostRevision]

// prettier-ignore
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends 'embed' ? / * Inlined std.Pick<@wordpress/core-data.@wordpress/core-data/schema.Schema.BaseStatus, @wordpress/core-data.@wordpress/core-data/schema.Schema.EmbedKeys.Status> * /
{  _embedded :std.Record<string, std.Array<any>> | undefined | undefined,   _links :std.Record<string, std.Array<{  href :string, [k: string] : any}>>,   name :string,   slug :string} : T extends 'view' ? / * Inlined std.Pick<@wordpress/core-data.@wordpress/core-data/schema.Schema.BaseStatus, @wordpress/core-data.@wordpress/core-data/schema.Schema.ViewKeys.Status> * /
{  queryable :boolean,   _embedded :std.Record<string, std.Array<any>> | undefined | undefined,   _links :std.Record<string, std.Array<{  href :string, [k: string] : any}>>,   slug :string,   name :string,   public :boolean} : @wordpress/core-data.@wordpress/core-data/schema.Schema.BaseStatus
  }}}
  */
type Status[T /* <: Context */] = BaseStatus

// prettier-ignore
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends 'embed' ? / * Inlined std.Pick<@wordpress/core-data.@wordpress/core-data/schema.Schema.BaseTag, @wordpress/core-data.@wordpress/core-data/schema.Schema.EmbedKeys.Tag> * /
{  taxonomy :@wordpress/core-data.@wordpress/core-data/schema.Schema.TaxonomyKind,   _embedded :std.Record<string, std.Array<any>> | undefined | undefined,   _links :std.Record<string, std.Array<{  href :string, [k: string] : any}>>,   slug :string,   name :string,   id :number,   link :string} : @wordpress/core-data.@wordpress/core-data/schema.Schema.BaseTag
  }}}
  */
type Tag[T /* <: Context */] = BaseTag

// prettier-ignore
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends 'embed' ? std.Pick<@wordpress/core-data.@wordpress/core-data/schema.Schema.BaseTaxonomy<T>, @wordpress/core-data.@wordpress/core-data/schema.Schema.EmbedKeys.Taxonomy> : T extends 'view' ? std.Pick<@wordpress/core-data.@wordpress/core-data/schema.Schema.BaseTaxonomy<T>, @wordpress/core-data.@wordpress/core-data/schema.Schema.ViewKeys.Taxonomy> : @wordpress/core-data.@wordpress/core-data/schema.Schema.BaseTaxonomy<T>
  }}}
  */
type Taxonomy[T /* <: Context */] = Pick[BaseTaxonomy[T], typings.wordpressCoreData.schemaMod.Schema.EmbedKeys.Taxonomy]

// prettier-ignore
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends 'embed' ? std.Pick<@wordpress/core-data.@wordpress/core-data/schema.Schema.BaseType<T>, @wordpress/core-data.@wordpress/core-data/schema.Schema.EmbedKeys.Type> : T extends 'view' ? std.Pick<@wordpress/core-data.@wordpress/core-data/schema.Schema.BaseType<T>, @wordpress/core-data.@wordpress/core-data/schema.Schema.ViewKeys.Type> : @wordpress/core-data.@wordpress/core-data/schema.Schema.BaseType<T>
  }}}
  */
type Type[T /* <: Context */] = Pick[BaseType[T], typings.wordpressCoreData.schemaMod.Schema.EmbedKeys.Type]

// prettier-ignore
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends 'embed' ? std.Pick<@wordpress/core-data.@wordpress/core-data/schema.Schema.BaseUser<T>, @wordpress/core-data.@wordpress/core-data/schema.Schema.EmbedKeys.User> : T extends 'view' ? std.Pick<@wordpress/core-data.@wordpress/core-data/schema.Schema.BaseUser<T>, @wordpress/core-data.@wordpress/core-data/schema.Schema.ViewKeys.User> : @wordpress/core-data.@wordpress/core-data/schema.Schema.BaseUser<T>
  }}}
  */
type User[T /* <: Context */] = Pick[BaseUser[T], typings.wordpressCoreData.schemaMod.Schema.EmbedKeys.User]
