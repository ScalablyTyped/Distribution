package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImgProps extends StObject {
  
  var className: js.Array[Label]
  
  var imgProps: js.Array[LabelValue]
  
  var initialsLimit: js.Array[LabelNumber]
  
  def onClick(): Unit
  
  var placeholder: js.Array[Value]
}
object ImgProps {
  
  @scala.inline
  def apply(
    className: js.Array[Label],
    imgProps: js.Array[LabelValue],
    initialsLimit: js.Array[LabelNumber],
    onClick: () => Unit,
    placeholder: js.Array[Value]
  ): ImgProps = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], imgProps = imgProps.asInstanceOf[js.Any], initialsLimit = initialsLimit.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), placeholder = placeholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImgProps]
  }
  
  @scala.inline
  implicit class ImgPropsMutableBuilder[Self <: ImgProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: js.Array[Label]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameVarargs(value: Label*): Self = StObject.set(x, "className", js.Array(value :_*))
    
    @scala.inline
    def setImgProps(value: js.Array[LabelValue]): Self = StObject.set(x, "imgProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImgPropsVarargs(value: LabelValue*): Self = StObject.set(x, "imgProps", js.Array(value :_*))
    
    @scala.inline
    def setInitialsLimit(value: js.Array[LabelNumber]): Self = StObject.set(x, "initialsLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialsLimitVarargs(value: LabelNumber*): Self = StObject.set(x, "initialsLimit", js.Array(value :_*))
    
    @scala.inline
    def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPlaceholder(value: js.Array[Value]): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderVarargs(value: Value*): Self = StObject.set(x, "placeholder", js.Array(value :_*))
  }
}
