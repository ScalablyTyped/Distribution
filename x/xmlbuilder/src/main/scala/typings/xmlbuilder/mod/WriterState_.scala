package typings.xmlbuilder.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WriterState_ extends js.Object

/**
  * Defines the state of the writer.
  */
@JSImport("xmlbuilder", "WriterState")
@js.native
object WriterState_ extends js.Object {
  /**
    * Writer is at a closing tag, e.g. `</node>`
    */
  @js.native
  sealed trait CloseTag extends WriterState_
  
  /**
    * Writer is inside an element
    */
  @js.native
  sealed trait InsideTag extends WriterState_
  
  /**
    * Writer state is unknown
    */
  @js.native
  sealed trait None extends WriterState_
  
  /**
    * Writer is at an opening tag, e.g. `<node>`
    */
  @js.native
  sealed trait OpenTag extends WriterState_
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WriterState_ with Double] = js.native
  /* 3 */ @js.native
  object CloseTag extends TopLevel[CloseTag with Double]
  
  /* 2 */ @js.native
  object InsideTag extends TopLevel[InsideTag with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 1 */ @js.native
  object OpenTag extends TopLevel[OpenTag with Double]
  
}

