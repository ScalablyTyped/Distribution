package typings.winrt.Windows.Storage.Search

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
  
}

