package typings.yaml.parseCstMod.CST

import typings.yaml.utilMod.Type.ALIAS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alias
  extends StObject
     with Node
     with ContentNode {
  
  /** contain the anchor without the * prefix */
  @JSName("rawValue")
  val rawValue_Alias: String
  
  @JSName("type")
  var type_Alias: ALIAS
}
object Alias {
  
  @scala.inline
  def apply(
    hasComment: Boolean,
    hasProps: Boolean,
    jsonLike: Boolean,
    props: js.Array[Range],
    rawValue: String,
    `type`: ALIAS,
    valueRangeContainsNewline: Boolean
  ): Alias = {
    val __obj = js.Dynamic.literal(hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any], anchor = null, comment = null, context = null, error = null, range = null, tag = null, value = null, valueRange = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alias]
  }
  
  @scala.inline
  implicit class AliasMutableBuilder[Self <: Alias] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRawValue(value: String): Self = StObject.set(x, "rawValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ALIAS): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
