package typings
package winrtLib.WindowsNs.StorageNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CommonFileQuery extends js.Object

@JSGlobal("Windows.Storage.Search.CommonFileQuery")
@js.native
object CommonFileQuery extends js.Object {
  @js.native
  sealed trait defaultQuery
    extends winrtLib.WindowsNs.StorageNs.SearchNs.CommonFileQuery
  
  @js.native
  sealed trait orderByDate
    extends winrtLib.WindowsNs.StorageNs.SearchNs.CommonFileQuery
  
  @js.native
  sealed trait orderByMusicProperties
    extends winrtLib.WindowsNs.StorageNs.SearchNs.CommonFileQuery
  
  @js.native
  sealed trait orderByName
    extends winrtLib.WindowsNs.StorageNs.SearchNs.CommonFileQuery
  
  @js.native
  sealed trait orderBySearchRank
    extends winrtLib.WindowsNs.StorageNs.SearchNs.CommonFileQuery
  
  @js.native
  sealed trait orderByTitle
    extends winrtLib.WindowsNs.StorageNs.SearchNs.CommonFileQuery
  
  /* 0 */ val defaultQuery: defaultQuery with scala.Double = js.native
  /* 5 */ val orderByDate: orderByDate with scala.Double = js.native
  /* 3 */ val orderByMusicProperties: orderByMusicProperties with scala.Double = js.native
  /* 1 */ val orderByName: orderByName with scala.Double = js.native
  /* 4 */ val orderBySearchRank: orderBySearchRank with scala.Double = js.native
  /* 2 */ val orderByTitle: orderByTitle with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.StorageNs.SearchNs.CommonFileQuery with scala.Double] = js.native
}

