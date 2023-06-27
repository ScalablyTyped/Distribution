package typings.vanillaColorful

import typings.vanillaColorful.libTypesMod.HslColor
import typings.vanillaColorful.libTypesMod.HslaColor
import typings.vanillaColorful.libTypesMod.HsvColor
import typings.vanillaColorful.libTypesMod.HsvaColor
import typings.vanillaColorful.libTypesMod.RgbColor
import typings.vanillaColorful.libTypesMod.RgbaColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Value extends StObject {
    
    var value: String
  }
  object Value {
    
    inline def apply(value: String): Value = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ValueHslColor extends StObject {
    
    var value: HslColor
  }
  object ValueHslColor {
    
    inline def apply(value: HslColor): ValueHslColor = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueHslColor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValueHslColor] (val x: Self) extends AnyVal {
      
      inline def setValue(value: HslColor): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ValueHslaColor extends StObject {
    
    var value: HslaColor
  }
  object ValueHslaColor {
    
    inline def apply(value: HslaColor): ValueHslaColor = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueHslaColor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValueHslaColor] (val x: Self) extends AnyVal {
      
      inline def setValue(value: HslaColor): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ValueHsvColor extends StObject {
    
    var value: HsvColor
  }
  object ValueHsvColor {
    
    inline def apply(value: HsvColor): ValueHsvColor = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueHsvColor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValueHsvColor] (val x: Self) extends AnyVal {
      
      inline def setValue(value: HsvColor): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ValueHsvaColor extends StObject {
    
    var value: HsvaColor
  }
  object ValueHsvaColor {
    
    inline def apply(value: HsvaColor): ValueHsvaColor = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueHsvaColor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValueHsvaColor] (val x: Self) extends AnyVal {
      
      inline def setValue(value: HsvaColor): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ValueRgbColor extends StObject {
    
    var value: RgbColor
  }
  object ValueRgbColor {
    
    inline def apply(value: RgbColor): ValueRgbColor = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueRgbColor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValueRgbColor] (val x: Self) extends AnyVal {
      
      inline def setValue(value: RgbColor): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ValueRgbaColor extends StObject {
    
    var value: RgbaColor
  }
  object ValueRgbaColor {
    
    inline def apply(value: RgbaColor): ValueRgbaColor = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueRgbaColor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValueRgbaColor] (val x: Self) extends AnyVal {
      
      inline def setValue(value: RgbaColor): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ValueT[T] extends StObject {
    
    var value: T
  }
  object ValueT {
    
    inline def apply[T](value: T): ValueT[T] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueT[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValueT[?], T] (val x: Self & ValueT[T]) extends AnyVal {
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
