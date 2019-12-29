package typings.winrt.Windows.Storage.Search

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CommonFileQuery with Double] = js.native
  /* 0 */ @js.native
  object defaultQuery extends TopLevel[defaultQuery with Double]
  
  /* 5 */ @js.native
  object orderByDate extends TopLevel[orderByDate with Double]
  
  /* 3 */ @js.native
  object orderByMusicProperties extends TopLevel[orderByMusicProperties with Double]
  
  /* 1 */ @js.native
  object orderByName extends TopLevel[orderByName with Double]
  
  /* 4 */ @js.native
  object orderBySearchRank extends TopLevel[orderBySearchRank with Double]
  
  /* 2 */ @js.native
  object orderByTitle extends TopLevel[orderByTitle with Double]
  
}

