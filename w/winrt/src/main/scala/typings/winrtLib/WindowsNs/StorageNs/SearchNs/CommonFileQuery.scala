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
  
  val defaultQuery: defaultQuery with java.lang.String = js.native
  val orderByDate: orderByDate with java.lang.String = js.native
  val orderByMusicProperties: orderByMusicProperties with java.lang.String = js.native
  val orderByName: orderByName with java.lang.String = js.native
  val orderBySearchRank: orderBySearchRank with java.lang.String = js.native
  val orderByTitle: orderByTitle with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.StorageNs.SearchNs.CommonFileQuery with java.lang.String] = js.native
}

