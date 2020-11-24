package typings.wordpressElement.createInterpolateElementMod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Frame extends js.Object {
  
  /**
    * Children.
    */
  var children: js.Array[ReactElement] = js.native
  
  /**
    * A parent element which may still have
    */
  var element: ReactElement = js.native
  
  /**
    * Offset at which last closing element
    *  finished, used for finding text between
    *  elements.
    */
  var leadingTextStart: js.UndefOr[Double] = js.native
  
  /**
    * Running offset at which parsing should
    *        continue.
    */
  var prevOffset: js.UndefOr[Double] = js.native
  
  /**
    * Length of string marking start of parent
    * element.
    */
  var tokenLength: Double = js.native
  
  /**
    * Offset at which parent element first
    * appears.
    */
  var tokenStart: Double = js.native
}
object Frame {
  
  @scala.inline
  def apply(children: js.Array[ReactElement], element: ReactElement, tokenLength: Double, tokenStart: Double): Frame = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], tokenLength = tokenLength.asInstanceOf[js.Any], tokenStart = tokenStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
  
  @scala.inline
  implicit class FrameOps[Self <: Frame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChildrenVarargs(value: ReactElement*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[ReactElement]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: ReactElement): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenLength(value: Double): Self = this.set("tokenLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenStart(value: Double): Self = this.set("tokenStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeadingTextStart(value: Double): Self = this.set("leadingTextStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeadingTextStart: Self = this.set("leadingTextStart", js.undefined)
    
    @scala.inline
    def setPrevOffset(value: Double): Self = this.set("prevOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevOffset: Self = this.set("prevOffset", js.undefined)
  }
}
