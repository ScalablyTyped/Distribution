package typings.tryghostContentApi.mod

import typings.tryghostContentApi.anon.Id
import typings.tryghostContentApi.anon.Slug
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ArrayOrValue[T] = T | js.Array[T]

type Authors = BrowseResults[Author]

type BrowseFunction[T] = js.Function2[
/* options */ js.UndefOr[Params], 
/* memberToken */ js.UndefOr[Nullable[String]], 
js.Promise[T]]

type FieldParam = String

type FilterParam = String

type LimitParam = Double | String

type Nullable[T] = T | Null

type OrderParam = String

type PageParam = Double

type PostsOrPages = BrowseResults[PostOrPage]

type ReadFunction[T] = js.Function3[
/* data */ Id | Slug, 
/* options */ js.UndefOr[Params], 
/* memberToken */ js.UndefOr[Nullable[String]], 
js.Promise[T]]

type Tags = BrowseResults[Tag]
