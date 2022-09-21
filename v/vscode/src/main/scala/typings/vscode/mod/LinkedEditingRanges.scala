package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "LinkedEditingRanges")
@js.native
open class LinkedEditingRanges protected () extends StObject {
  /**
    * Create a new linked editing ranges object.
    *
    * @param ranges A list of ranges that can be edited together
    * @param wordPattern An optional word pattern that describes valid contents for the given ranges
    */
  def this(ranges: js.Array[Range]) = this()
  def this(ranges: js.Array[Range], wordPattern: js.RegExp) = this()
  
  /**
    * A list of ranges that can be edited together. The ranges must have
    * identical length and text content. The ranges cannot overlap.
    */
  val ranges: js.Array[Range] = js.native
  
  /**
    * An optional word pattern that describes valid contents for the given ranges.
    * If no pattern is provided, the language configuration's word pattern will be used.
    */
  val wordPattern: js.UndefOr[js.RegExp] = js.native
}
