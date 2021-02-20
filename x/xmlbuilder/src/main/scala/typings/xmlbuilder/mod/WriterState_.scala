package typings.xmlbuilder.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WriterState_ extends StObject
/**
  * Defines the state of the writer.
  */
@JSImport("xmlbuilder", "WriterState")
@js.native
object WriterState_ extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WriterState_ with Double] = js.native
  
  /**
    * Writer is at a closing tag, e.g. `</node>`
    */
  @js.native
  sealed trait CloseTag extends WriterState_
  /* 3 */ val CloseTag: typings.xmlbuilder.mod.WriterState_.CloseTag with Double = js.native
  
  /**
    * Writer is inside an element
    */
  @js.native
  sealed trait InsideTag extends WriterState_
  /* 2 */ val InsideTag: typings.xmlbuilder.mod.WriterState_.InsideTag with Double = js.native
  
  /**
    * Writer state is unknown
    */
  @js.native
  sealed trait None extends WriterState_
  /* 0 */ val None: typings.xmlbuilder.mod.WriterState_.None with Double = js.native
  
  /**
    * Writer is at an opening tag, e.g. `<node>`
    */
  @js.native
  sealed trait OpenTag extends WriterState_
  /* 1 */ val OpenTag: typings.xmlbuilder.mod.WriterState_.OpenTag with Double = js.native
}
