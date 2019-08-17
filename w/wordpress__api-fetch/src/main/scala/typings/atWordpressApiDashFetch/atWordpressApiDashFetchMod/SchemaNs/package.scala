package typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SchemaNs {
  import typings.atWordpressApiDashFetch.Anon_Raw
  import typings.atWordpressApiDashFetch.Anon_Rendered
  import typings.std.Partial
  import typings.std.Pick

  // prettier-ignore
  type Block[T /* <: Context */] = BaseBlock[T] | (Pick[
    BaseBlock[T], 
    typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.SchemaNs.ViewKeysNs.Block | typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.SchemaNs.EmbedKeysNs.Block
  ])
  // prettier-ignore
  type Category[T /* <: Context */] = BaseCategory | (Pick[
    BaseCategory, 
    typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.SchemaNs.ViewKeysNs.Category | typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.SchemaNs.EmbedKeysNs.Category
  ])
  // prettier-ignore
  type Comment[T /* <: Context */] = BaseComment[T] | (Pick[
    BaseComment[T], 
    typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.SchemaNs.ViewKeysNs.Comment | typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.SchemaNs.EmbedKeysNs.Comment
  ])
  type Contextual[T /* <: Context */, TAdditional, TEditAdditional] = (Anon_Rendered with TAdditional) | (Anon_Raw with TAdditional with TEditAdditional)
  type Decontextualize[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ k in keyof T ]: T[k] extends @wordpress/api-fetch.@wordpress/api-fetch.Schema.Contextual<any, {}, {}>? string : T[k]}
    */ typings.atWordpressApiDashFetch.atWordpressApiDashFetchStrings.Decontextualize with js.Any
  // prettier-ignore
  type Media[T /* <: Context */] = BaseMedia[T] | (Pick[
    BaseMedia[T], 
    typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.SchemaNs.ViewKeysNs.Media | typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.SchemaNs.EmbedKeysNs.Media
  ])
  // prettier-ignore
  type Page[T /* <: Context */] = BasePage[T] | (Pick[
    BasePage[T], 
    typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.SchemaNs.ViewKeysNs.Page | typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.SchemaNs.EmbedKeysNs.Page
  ])
  // prettier-ignore
  type Post[T /* <: Context */] = BasePost[T] | (Pick[
    BasePost[T], 
    typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.SchemaNs.ViewKeysNs.Post | typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.SchemaNs.EmbedKeysNs.Post
  ])
  // prettier-ignore
  type PostOrPage[T /* <: Context */] = (BasePost[T] with Partial[BasePage[T]]) | ((Pick[
    BasePost[T], 
    typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.SchemaNs.ViewKeysNs.Post
  ]) with (Partial[
    Pick[
      BasePage[T], 
      typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.SchemaNs.ViewKeysNs.Page
    ]
  ])) | ((Pick[
    BasePost[T], 
    typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.SchemaNs.EmbedKeysNs.Post
  ]) with (Partial[
    Pick[
      BasePage[T], 
      typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.SchemaNs.EmbedKeysNs.Page
    ]
  ]))
  // prettier-ignore
  type PostRevision[T /* <: Context */] = BasePostRevision[T] | (Pick[
    BasePostRevision[T], 
    typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.SchemaNs.ViewKeysNs.PostRevision | typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.SchemaNs.EmbedKeysNs.PostRevision
  ])
  // prettier-ignore
  type Status[T /* <: Context */] = BaseStatus | (Pick[
    BaseStatus, 
    typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.SchemaNs.ViewKeysNs.Status | typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.SchemaNs.EmbedKeysNs.Status
  ])
  // prettier-ignore
  type Tag[T /* <: Context */] = BaseTag | (Pick[
    BaseTag, 
    typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.SchemaNs.EmbedKeysNs.Tag
  ])
  // prettier-ignore
  type Taxonomy[T /* <: Context */] = BaseTaxonomy[T] | (Pick[
    BaseTaxonomy[T], 
    typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.SchemaNs.ViewKeysNs.Taxonomy | typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.SchemaNs.EmbedKeysNs.Taxonomy
  ])
  // prettier-ignore
  type Type[T /* <: Context */] = BaseType[T] | (Pick[
    BaseType[T], 
    typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.SchemaNs.ViewKeysNs.Type | typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.SchemaNs.EmbedKeysNs.Type
  ])
  // prettier-ignore
  type User[T /* <: Context */] = BaseUser[T] | (Pick[
    BaseUser[T], 
    typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.SchemaNs.ViewKeysNs.User | typings.atWordpressApiDashFetch.atWordpressApiDashFetchMod.SchemaNs.EmbedKeysNs.User
  ])
}
