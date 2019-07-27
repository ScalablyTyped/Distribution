package typings
package atWordpressApiDashFetchLib.atWordpressApiDashFetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SchemaNs {
  // prettier-ignore
  type Block[T /* <: Context */] = BaseBlock[T] | (stdLib.Pick[
    BaseBlock[T], 
    atWordpressApiDashFetchLib.atWordpressApiDashFetchMod.SchemaNs.ViewKeysNs.Block | atWordpressApiDashFetchLib.atWordpressApiDashFetchMod.SchemaNs.EmbedKeysNs.Block
  ])
  // prettier-ignore
  type Category[T /* <: Context */] = BaseCategory | (stdLib.Pick[
    BaseCategory, 
    atWordpressApiDashFetchLib.atWordpressApiDashFetchMod.SchemaNs.ViewKeysNs.Category | atWordpressApiDashFetchLib.atWordpressApiDashFetchMod.SchemaNs.EmbedKeysNs.Category
  ])
  // prettier-ignore
  type Comment[T /* <: Context */] = BaseComment[T] | (stdLib.Pick[
    BaseComment[T], 
    atWordpressApiDashFetchLib.atWordpressApiDashFetchMod.SchemaNs.ViewKeysNs.Comment | atWordpressApiDashFetchLib.atWordpressApiDashFetchMod.SchemaNs.EmbedKeysNs.Comment
  ])
  type Contextual[T /* <: Context */, TAdditional, TEditAdditional] = (atWordpressApiDashFetchLib.Anon_Rendered with TAdditional) | (atWordpressApiDashFetchLib.Anon_Raw with TAdditional with TEditAdditional)
  type Decontextualize[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ k in keyof T ]: T[k] extends @wordpress/api-fetch.@wordpress/api-fetch.Schema.Contextual<any, {}, {}>? string : T[k]}
    */ atWordpressApiDashFetchLib.atWordpressApiDashFetchLibStrings.Decontextualize with js.Any
  // prettier-ignore
  type Media[T /* <: Context */] = BaseMedia[T] | (stdLib.Pick[
    BaseMedia[T], 
    atWordpressApiDashFetchLib.atWordpressApiDashFetchMod.SchemaNs.ViewKeysNs.Media | atWordpressApiDashFetchLib.atWordpressApiDashFetchMod.SchemaNs.EmbedKeysNs.Media
  ])
  // prettier-ignore
  type Page[T /* <: Context */] = BasePage[T] | (stdLib.Pick[
    BasePage[T], 
    atWordpressApiDashFetchLib.atWordpressApiDashFetchMod.SchemaNs.ViewKeysNs.Page | atWordpressApiDashFetchLib.atWordpressApiDashFetchMod.SchemaNs.EmbedKeysNs.Page
  ])
  // prettier-ignore
  type Post[T /* <: Context */] = BasePost[T] | (stdLib.Pick[
    BasePost[T], 
    atWordpressApiDashFetchLib.atWordpressApiDashFetchMod.SchemaNs.ViewKeysNs.Post | atWordpressApiDashFetchLib.atWordpressApiDashFetchMod.SchemaNs.EmbedKeysNs.Post
  ])
  // prettier-ignore
  type PostOrPage[T /* <: Context */] = (BasePost[T] with stdLib.Partial[BasePage[T]]) | ((stdLib.Pick[
    BasePost[T], 
    atWordpressApiDashFetchLib.atWordpressApiDashFetchMod.SchemaNs.ViewKeysNs.Post
  ]) with (stdLib.Partial[
    stdLib.Pick[
      BasePage[T], 
      atWordpressApiDashFetchLib.atWordpressApiDashFetchMod.SchemaNs.ViewKeysNs.Page
    ]
  ])) | ((stdLib.Pick[
    BasePost[T], 
    atWordpressApiDashFetchLib.atWordpressApiDashFetchMod.SchemaNs.EmbedKeysNs.Post
  ]) with (stdLib.Partial[
    stdLib.Pick[
      BasePage[T], 
      atWordpressApiDashFetchLib.atWordpressApiDashFetchMod.SchemaNs.EmbedKeysNs.Page
    ]
  ]))
  // prettier-ignore
  type PostRevision[T /* <: Context */] = BasePostRevision[T] | (stdLib.Pick[
    BasePostRevision[T], 
    atWordpressApiDashFetchLib.atWordpressApiDashFetchMod.SchemaNs.ViewKeysNs.PostRevision | atWordpressApiDashFetchLib.atWordpressApiDashFetchMod.SchemaNs.EmbedKeysNs.PostRevision
  ])
  // prettier-ignore
  type Status[T /* <: Context */] = BaseStatus | (stdLib.Pick[
    BaseStatus, 
    atWordpressApiDashFetchLib.atWordpressApiDashFetchMod.SchemaNs.ViewKeysNs.Status | atWordpressApiDashFetchLib.atWordpressApiDashFetchMod.SchemaNs.EmbedKeysNs.Status
  ])
  // prettier-ignore
  type Tag[T /* <: Context */] = BaseTag | (stdLib.Pick[
    BaseTag, 
    atWordpressApiDashFetchLib.atWordpressApiDashFetchMod.SchemaNs.EmbedKeysNs.Tag
  ])
  // prettier-ignore
  type Taxonomy[T /* <: Context */] = BaseTaxonomy[T] | (stdLib.Pick[
    BaseTaxonomy[T], 
    atWordpressApiDashFetchLib.atWordpressApiDashFetchMod.SchemaNs.ViewKeysNs.Taxonomy | atWordpressApiDashFetchLib.atWordpressApiDashFetchMod.SchemaNs.EmbedKeysNs.Taxonomy
  ])
  // prettier-ignore
  type Type[T /* <: Context */] = BaseType[T] | (stdLib.Pick[
    BaseType[T], 
    atWordpressApiDashFetchLib.atWordpressApiDashFetchMod.SchemaNs.ViewKeysNs.Type | atWordpressApiDashFetchLib.atWordpressApiDashFetchMod.SchemaNs.EmbedKeysNs.Type
  ])
  // prettier-ignore
  type User[T /* <: Context */] = BaseUser[T] | (stdLib.Pick[
    BaseUser[T], 
    atWordpressApiDashFetchLib.atWordpressApiDashFetchMod.SchemaNs.ViewKeysNs.User | atWordpressApiDashFetchLib.atWordpressApiDashFetchMod.SchemaNs.EmbedKeysNs.User
  ])
}
