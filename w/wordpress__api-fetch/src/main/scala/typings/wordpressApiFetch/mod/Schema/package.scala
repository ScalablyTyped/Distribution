package typings.wordpressApiFetch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Schema {
  
  // prettier-ignore
  type Block[T /* <: typings.wordpressApiFetch.mod.Schema.Context */] = typings.wordpressApiFetch.mod.Schema.BaseBlock[T] | (typings.std.Pick[
    typings.wordpressApiFetch.mod.Schema.BaseBlock[T], 
    typings.wordpressApiFetch.mod.Schema.ViewKeys.Block | typings.wordpressApiFetch.mod.Schema.EmbedKeys.Block
  ])
  
  // prettier-ignore
  type Comment[T /* <: typings.wordpressApiFetch.mod.Schema.Context */] = typings.wordpressApiFetch.mod.Schema.BaseComment[T] | (typings.std.Pick[
    typings.wordpressApiFetch.mod.Schema.BaseComment[T], 
    typings.wordpressApiFetch.mod.Schema.ViewKeys.Comment | typings.wordpressApiFetch.mod.Schema.EmbedKeys.Comment
  ])
  
  type Contextual[T /* <: typings.wordpressApiFetch.mod.Schema.Context */, TAdditional, TEditAdditional] = (typings.wordpressApiFetch.anon.Rendered with TAdditional) | (typings.wordpressApiFetch.anon.Raw with TAdditional with TEditAdditional)
  
  type Decontextualize[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof T ]: T[k] extends @wordpress/api-fetch.@wordpress/api-fetch.Schema.Contextual<any, {}, {}>? string : T[k]}
    */ typings.wordpressApiFetch.wordpressApiFetchStrings.Decontextualize with org.scalablytyped.runtime.TopLevel[js.Any]
  
  // prettier-ignore
  type Media[T /* <: typings.wordpressApiFetch.mod.Schema.Context */] = typings.wordpressApiFetch.mod.Schema.BaseMedia[T] | (typings.std.Pick[
    typings.wordpressApiFetch.mod.Schema.BaseMedia[T], 
    typings.wordpressApiFetch.mod.Schema.ViewKeys.Media | typings.wordpressApiFetch.mod.Schema.EmbedKeys.Media
  ])
  
  // prettier-ignore
  type Page[T /* <: typings.wordpressApiFetch.mod.Schema.Context */] = typings.wordpressApiFetch.mod.Schema.BasePage[T] | (typings.std.Pick[
    typings.wordpressApiFetch.mod.Schema.BasePage[T], 
    typings.wordpressApiFetch.mod.Schema.ViewKeys.Page | typings.wordpressApiFetch.mod.Schema.EmbedKeys.Page
  ])
  
  // prettier-ignore
  type Post[T /* <: typings.wordpressApiFetch.mod.Schema.Context */] = typings.wordpressApiFetch.mod.Schema.BasePost[T] | (typings.std.Pick[
    typings.wordpressApiFetch.mod.Schema.BasePost[T], 
    typings.wordpressApiFetch.mod.Schema.ViewKeys.Post | typings.wordpressApiFetch.mod.Schema.EmbedKeys.Post
  ])
  
  // prettier-ignore
  type PostOrPage[T /* <: typings.wordpressApiFetch.mod.Schema.Context */] = (typings.wordpressApiFetch.mod.Schema.BasePost[T] with typings.std.Partial[typings.wordpressApiFetch.mod.Schema.BasePage[T]]) | ((typings.std.Pick[
    typings.wordpressApiFetch.mod.Schema.BasePost[T], 
    typings.wordpressApiFetch.mod.Schema.ViewKeys.Post
  ]) with (typings.std.Partial[
    typings.std.Pick[
      typings.wordpressApiFetch.mod.Schema.BasePage[T], 
      typings.wordpressApiFetch.mod.Schema.ViewKeys.Page
    ]
  ])) | ((typings.std.Pick[
    typings.wordpressApiFetch.mod.Schema.BasePost[T], 
    typings.wordpressApiFetch.mod.Schema.EmbedKeys.Post
  ]) with (typings.std.Partial[
    typings.std.Pick[
      typings.wordpressApiFetch.mod.Schema.BasePage[T], 
      typings.wordpressApiFetch.mod.Schema.EmbedKeys.Page
    ]
  ]))
  
  // prettier-ignore
  type PostRevision[T /* <: typings.wordpressApiFetch.mod.Schema.Context */] = typings.wordpressApiFetch.mod.Schema.BasePostRevision[T] | (typings.std.Pick[
    typings.wordpressApiFetch.mod.Schema.BasePostRevision[T], 
    typings.wordpressApiFetch.mod.Schema.ViewKeys.PostRevision | typings.wordpressApiFetch.mod.Schema.EmbedKeys.PostRevision
  ])
  
  // prettier-ignore
  type Taxonomy[T /* <: typings.wordpressApiFetch.mod.Schema.Context */] = typings.wordpressApiFetch.mod.Schema.BaseTaxonomy[T] | (typings.std.Pick[
    typings.wordpressApiFetch.mod.Schema.BaseTaxonomy[T], 
    typings.wordpressApiFetch.mod.Schema.ViewKeys.Taxonomy | typings.wordpressApiFetch.mod.Schema.EmbedKeys.Taxonomy
  ])
  
  // prettier-ignore
  type Type[T /* <: typings.wordpressApiFetch.mod.Schema.Context */] = typings.wordpressApiFetch.mod.Schema.BaseType[T] | (typings.std.Pick[
    typings.wordpressApiFetch.mod.Schema.BaseType[T], 
    typings.wordpressApiFetch.mod.Schema.ViewKeys.Type | typings.wordpressApiFetch.mod.Schema.EmbedKeys.Type
  ])
  
  // prettier-ignore
  type User[T /* <: typings.wordpressApiFetch.mod.Schema.Context */] = typings.wordpressApiFetch.mod.Schema.BaseUser[T] | (typings.std.Pick[
    typings.wordpressApiFetch.mod.Schema.BaseUser[T], 
    typings.wordpressApiFetch.mod.Schema.ViewKeys.User | typings.wordpressApiFetch.mod.Schema.EmbedKeys.User
  ])
}
