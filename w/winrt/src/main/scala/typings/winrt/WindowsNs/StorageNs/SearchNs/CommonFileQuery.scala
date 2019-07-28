package typings.winrt.WindowsNs.StorageNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CommonFileQuery extends js.Object

@JSGlobal("Windows.Storage.Search.CommonFileQuery")
@js.native
object CommonFileQuery extends js.Object {
  @js.native
  sealed trait defaultQuery extends CommonFileQuery
  
  @js.native
  sealed trait orderByDate extends CommonFileQuery
  
  @js.native
  sealed trait orderByMusicProperties extends CommonFileQuery
  
  @js.native
  sealed trait orderByName extends CommonFileQuery
  
  @js.native
  sealed trait orderBySearchRank extends CommonFileQuery
  
  @js.native
  sealed trait orderByTitle extends CommonFileQuery
  
  /* 0 */ val defaultQuery: typings.winrt.WindowsNs.StorageNs.SearchNs.CommonFileQuery.defaultQuery with Double = js.native
  /* 5 */ val orderByDate: typings.winrt.WindowsNs.StorageNs.SearchNs.CommonFileQuery.orderByDate with Double = js.native
  /* 3 */ val orderByMusicProperties: typings.winrt.WindowsNs.StorageNs.SearchNs.CommonFileQuery.orderByMusicProperties with Double = js.native
  /* 1 */ val orderByName: typings.winrt.WindowsNs.StorageNs.SearchNs.CommonFileQuery.orderByName with Double = js.native
  /* 4 */ val orderBySearchRank: typings.winrt.WindowsNs.StorageNs.SearchNs.CommonFileQuery.orderBySearchRank with Double = js.native
  /* 2 */ val orderByTitle: typings.winrt.WindowsNs.StorageNs.SearchNs.CommonFileQuery.orderByTitle with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CommonFileQuery with Double] = js.native
}

