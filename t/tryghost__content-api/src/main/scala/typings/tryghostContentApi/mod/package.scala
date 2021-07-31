package typings.tryghostContentApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ArrayOrValue[T] = T | js.Array[T]

type Authors = typings.tryghostContentApi.mod.BrowseResults[typings.tryghostContentApi.mod.Author]

type BrowseFunction[T] = js.Function2[
/* options */ js.UndefOr[typings.tryghostContentApi.mod.Params], 
/* memberToken */ js.UndefOr[typings.tryghostContentApi.mod.Nullable[java.lang.String]], 
js.Promise[T]]

type FieldParam = java.lang.String

type FilterParam = java.lang.String

type LimitParam = scala.Double | java.lang.String

type Nullable[T] = T | scala.Null

type OrderParam = java.lang.String

type PageParam = scala.Double

type PostsOrPages = typings.tryghostContentApi.mod.BrowseResults[typings.tryghostContentApi.mod.PostOrPage]

type ReadFunction[T] = js.Function3[
/* data */ typings.tryghostContentApi.anon.Id | typings.tryghostContentApi.anon.Slug, 
/* options */ js.UndefOr[typings.tryghostContentApi.mod.Params], 
/* memberToken */ js.UndefOr[typings.tryghostContentApi.mod.Nullable[java.lang.String]], 
js.Promise[T]]

type Tags = typings.tryghostContentApi.mod.BrowseResults[typings.tryghostContentApi.mod.Tag]
