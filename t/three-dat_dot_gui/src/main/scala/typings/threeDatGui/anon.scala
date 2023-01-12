package typings.threeDatGui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait GUI extends StObject {
    
    var GUI: Any
  }
  object GUI {
    
    inline def apply(GUI: Any): GUI = {
      val __obj = js.Dynamic.literal(GUI = GUI.asInstanceOf[js.Any])
      __obj.asInstanceOf[GUI]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GUI] (val x: Self) extends AnyVal {
      
      inline def setGUI(value: Any): Self = StObject.set(x, "GUI", value.asInstanceOf[js.Any])
    }
  }
  
  trait Inner extends StObject {
    
    var inner: js.UndefOr[Boolean] = js.undefined
    
    var recursive: js.UndefOr[Boolean] = js.undefined
    
    var stepPosition: js.UndefOr[Double] = js.undefined
    
    var stepRotation: js.UndefOr[Double] = js.undefined
    
    var stepScale: js.UndefOr[Double] = js.undefined
  }
  object Inner {
    
    inline def apply(): Inner = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Inner]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Inner] (val x: Self) extends AnyVal {
      
      inline def setInner(value: Boolean): Self = StObject.set(x, "inner", value.asInstanceOf[js.Any])
      
      inline def setInnerUndefined: Self = StObject.set(x, "inner", js.undefined)
      
      inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
      
      inline def setStepPosition(value: Double): Self = StObject.set(x, "stepPosition", value.asInstanceOf[js.Any])
      
      inline def setStepPositionUndefined: Self = StObject.set(x, "stepPosition", js.undefined)
      
      inline def setStepRotation(value: Double): Self = StObject.set(x, "stepRotation", value.asInstanceOf[js.Any])
      
      inline def setStepRotationUndefined: Self = StObject.set(x, "stepRotation", js.undefined)
      
      inline def setStepScale(value: Double): Self = StObject.set(x, "stepScale", value.asInstanceOf[js.Any])
      
      inline def setStepScaleUndefined: Self = StObject.set(x, "stepScale", js.undefined)
    }
  }
  
  trait Recursive extends StObject {
    
    var recursive: js.UndefOr[Boolean] = js.undefined
  }
  object Recursive {
    
    inline def apply(): Recursive = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Recursive]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Recursive] (val x: Self) extends AnyVal {
      
      inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    }
  }
  
  trait Step extends StObject {
    
    var step: js.UndefOr[Double] = js.undefined
  }
  object Step {
    
    inline def apply(): Step = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Step]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Step] (val x: Self) extends AnyVal {
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    }
  }
}
