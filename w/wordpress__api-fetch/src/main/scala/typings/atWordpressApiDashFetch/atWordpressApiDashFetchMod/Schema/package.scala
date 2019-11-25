package typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Schema {
  import typings.atWordpressApiDashFetch.Anon_Raw
  import typings.atWordpressApiDashFetch.Anon_Rendered
  import typings.std.Partial
  import typings.std.Pick

  // prettier-ignore
  type Block[T /* <: Context */] = BaseBlock[T] | (Pick[
    BaseBlock[T], 
    typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.ViewKeys.Block | typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.EmbedKeys.Block
  ])
  // prettier-ignore
  type Category[T /* <: Context */] = BaseCategory | (Pick[
    BaseCategory, 
    typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.ViewKeys.Category | typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.EmbedKeys.Category
  ])
  // prettier-ignore
  type Comment[T /* <: Context */] = BaseComment[T] | (Pick[
    BaseComment[T], 
    typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.ViewKeys.Comment | typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.EmbedKeys.Comment
  ])
  type Contextual[T /* <: Context */, TAdditional, TEditAdditional] = (Anon_Rendered with TAdditional) | (Anon_Raw with TAdditional with TEditAdditional)
  type Decontextualize[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof T ]: T[k] extends @wordpress/api-fetch.@wordpress/api-fetch.Schema.Contextual<any, {}, {}>? string : T[k]}
    */ typings.atWordpressApiDashFetch.atWordpressApiDashFetchStrings.Decontextualize with js.Any
  // prettier-ignore
  type Media[T /* <: Context */] = BaseMedia[T] | (Pick[
    BaseMedia[T], 
    typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.ViewKeys.Media | typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.EmbedKeys.Media
  ])
  // prettier-ignore
  type Page[T /* <: Context */] = BasePage[T] | (Pick[
    BasePage[T], 
    typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.ViewKeys.Page | typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.EmbedKeys.Page
  ])
  // prettier-ignore
  type Post[T /* <: Context */] = BasePost[T] | (Pick[
    BasePost[T], 
    typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.ViewKeys.Post | typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.EmbedKeys.Post
  ])
  // prettier-ignore
  type PostOrPage[T /* <: Context */] = (BasePost[T] with Partial[BasePage[T]]) | ((Pick[
    BasePost[T], 
    typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.ViewKeys.Post
  ]) with (Partial[
    Pick[
      BasePage[T], 
      typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.ViewKeys.Page
    ]
  ])) | ((Pick[
    BasePost[T], 
    typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.EmbedKeys.Post
  ]) with (Partial[
    Pick[
      BasePage[T], 
      typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.EmbedKeys.Page
    ]
  ]))
  // prettier-ignore
  type PostRevision[T /* <: Context */] = BasePostRevision[T] | (Pick[
    BasePostRevision[T], 
    typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.ViewKeys.PostRevision | typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.EmbedKeys.PostRevision
  ])
  // prettier-ignore
  type Status[T /* <: Context */] = BaseStatus | (Pick[
    BaseStatus, 
    typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.ViewKeys.Status | typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.EmbedKeys.Status
  ])
  // prettier-ignore
  type Tag[T /* <: Context */] = BaseTag | (Pick[
    BaseTag, 
    typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.EmbedKeys.Tag
  ])
  // prettier-ignore
  type Taxonomy[T /* <: Context */] = BaseTaxonomy[T] | (Pick[
    BaseTaxonomy[T], 
    typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.ViewKeys.Taxonomy | typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.EmbedKeys.Taxonomy
  ])
  // prettier-ignore
  type Type[T /* <: Context */] = BaseType[T] | (Pick[
    BaseType[T], 
    typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.ViewKeys.Type | typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.EmbedKeys.Type
  ])
  // prettier-ignore
  type User[T /* <: Context */] = BaseUser[T] | (Pick[
    BaseUser[T], 
    typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.ViewKeys.User | typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.Schema.EmbedKeys.User
  ])
}
