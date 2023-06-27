package typings.vextab

import typings.std.CanvasRenderingContext2D
import typings.vexflow.mod.Flow.FretHandFinger
import typings.vexflow.mod.Flow.StringNumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bottomspacing extends StObject {
    
    var bottom_spacing: js.UndefOr[Double] = js.undefined
    
    var font_face: js.UndefOr[String] = js.undefined
    
    var font_size: js.UndefOr[Double] = js.undefined
    
    var font_style: js.UndefOr[Any] = js.undefined
    
    var note_stave_lower_spacing: js.UndefOr[Double] = js.undefined
    
    var scale: js.UndefOr[Double] = js.undefined
    
    var tab_stave_lower_spacing: js.UndefOr[Double] = js.undefined
  }
  object Bottomspacing {
    
    inline def apply(): Bottomspacing = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Bottomspacing]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Bottomspacing] (val x: Self) extends AnyVal {
      
      inline def setBottom_spacing(value: Double): Self = StObject.set(x, "bottom_spacing", value.asInstanceOf[js.Any])
      
      inline def setBottom_spacingUndefined: Self = StObject.set(x, "bottom_spacing", js.undefined)
      
      inline def setFont_face(value: String): Self = StObject.set(x, "font_face", value.asInstanceOf[js.Any])
      
      inline def setFont_faceUndefined: Self = StObject.set(x, "font_face", js.undefined)
      
      inline def setFont_size(value: Double): Self = StObject.set(x, "font_size", value.asInstanceOf[js.Any])
      
      inline def setFont_sizeUndefined: Self = StObject.set(x, "font_size", js.undefined)
      
      inline def setFont_style(value: Any): Self = StObject.set(x, "font_style", value.asInstanceOf[js.Any])
      
      inline def setFont_styleUndefined: Self = StObject.set(x, "font_style", js.undefined)
      
      inline def setNote_stave_lower_spacing(value: Double): Self = StObject.set(x, "note_stave_lower_spacing", value.asInstanceOf[js.Any])
      
      inline def setNote_stave_lower_spacingUndefined: Self = StObject.set(x, "note_stave_lower_spacing", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setTab_stave_lower_spacing(value: Double): Self = StObject.set(x, "tab_stave_lower_spacing", value.asInstanceOf[js.Any])
      
      inline def setTab_stave_lower_spacingUndefined: Self = StObject.set(x, "tab_stave_lower_spacing", js.undefined)
    }
  }
  
  trait Context extends StObject {
    
    var context: CanvasRenderingContext2D
    
    var scale: Double
    
    var voices: js.Array[Any]
  }
  object Context {
    
    inline def apply(context: CanvasRenderingContext2D, scale: Double, voices: js.Array[Any]): Context = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], voices = voices.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      inline def setContext(value: CanvasRenderingContext2D): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setVoices(value: js.Array[Any]): Self = StObject.set(x, "voices", value.asInstanceOf[js.Any])
      
      inline def setVoicesVarargs(value: Any*): Self = StObject.set(x, "voices", js.Array(value*))
    }
  }
  
  trait Fret extends StObject {
    
    var fret: Double
    
    var str: Double
  }
  object Fret {
    
    inline def apply(fret: Double, str: Double): Fret = {
      val __obj = js.Dynamic.literal(fret = fret.asInstanceOf[js.Any], str = str.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fret]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Fret] (val x: Self) extends AnyVal {
      
      inline def setFret(value: Double): Self = StObject.set(x, "fret", value.asInstanceOf[js.Any])
      
      inline def setStr(value: Double): Self = StObject.set(x, "str", value.asInstanceOf[js.Any])
    }
  }
  
  trait Modifier extends StObject {
    
    var modifier: FretHandFinger | StringNumber | Null
    
    var num: Double
  }
  object Modifier {
    
    inline def apply(num: Double): Modifier = {
      val __obj = js.Dynamic.literal(num = num.asInstanceOf[js.Any], modifier = null)
      __obj.asInstanceOf[Modifier]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Modifier] (val x: Self) extends AnyVal {
      
      inline def setModifier(value: FretHandFinger | StringNumber): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
      
      inline def setModifierNull: Self = StObject.set(x, "modifier", null)
      
      inline def setNum(value: Double): Self = StObject.set(x, "num", value.asInstanceOf[js.Any])
    }
  }
  
  trait Position extends StObject {
    
    var position: Double
  }
  object Position {
    
    inline def apply(position: Double): Position = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[Position]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
}
