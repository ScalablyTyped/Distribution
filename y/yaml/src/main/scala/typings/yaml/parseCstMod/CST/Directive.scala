package typings.yaml.parseCstMod.CST

import typings.yaml.utilMod.Type.DIRECTIVE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Directive extends Node {
  
  @JSName("anchor")
  val anchor_Directive: Null = js.native
  
  var name: String = js.native
  
  val parameters: js.Array[String] = js.native
  
  @JSName("tag")
  val tag_Directive: Null = js.native
  
  @JSName("type")
  var type_Directive: DIRECTIVE = js.native
}
object Directive {
  
  @scala.inline
  def apply(
    anchor: Null,
    hasComment: Boolean,
    hasProps: Boolean,
    jsonLike: Boolean,
    name: String,
    parameters: js.Array[String],
    props: js.Array[Range],
    tag: Null,
    `type`: DIRECTIVE,
    valueRangeContainsNewline: Boolean
  ): Directive = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Directive]
  }
  
  @scala.inline
  implicit class DirectiveMutableBuilder[Self <: Directive] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchor(value: Null): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: js.Array[String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersVarargs(value: String*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    @scala.inline
    def setTag(value: Null): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: DIRECTIVE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
