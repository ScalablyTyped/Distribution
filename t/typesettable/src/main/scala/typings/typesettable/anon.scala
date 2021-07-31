package typings.typesettable

import typings.typesettable.writerMod.IXAlign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Destroy extends StObject {
    
    def destroy(): Unit
    
    def write(line: String, width: Double, xAlign: IXAlign, xOffset: Double, yOffset: Double): Unit
  }
  object Destroy {
    
    @scala.inline
    def apply(destroy: () => Unit, write: (String, Double, IXAlign, Double, Double) => Unit): Destroy = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), write = js.Any.fromFunction5(write))
      __obj.asInstanceOf[Destroy]
    }
    
    @scala.inline
    implicit class DestroyMutableBuilder[Self <: Destroy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setWrite(value: (String, Double, IXAlign, Double, Double) => Unit): Self = StObject.set(x, "write", js.Any.fromFunction5(value))
    }
  }
  
  trait Height extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Height {
    
    @scala.inline
    def apply(height: Double, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ K in typesettable.typesettable/build/src/writers/writer.IXAlign ]: number} */
  trait KinIXAlignnumber extends StObject {
    
    var center: Double
    
    var left: Double
    
    var right: Double
  }
  object KinIXAlignnumber {
    
    @scala.inline
    def apply(center: Double, left: Double, right: Double): KinIXAlignnumber = {
      val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[KinIXAlignnumber]
    }
    
    @scala.inline
    implicit class KinIXAlignnumberMutableBuilder[Self <: KinIXAlignnumber] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCenter(value: Double): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ K in typesettable.typesettable/build/src/writers/writer.IYAlign ]: number} */
  trait KinIYAlignnumber extends StObject {
    
    var bottom: Double
    
    var center: Double
    
    var top: Double
  }
  object KinIYAlignnumber {
    
    @scala.inline
    def apply(bottom: Double, center: Double, top: Double): KinIYAlignnumber = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[KinIYAlignnumber]
    }
    
    @scala.inline
    implicit class KinIYAlignnumberMutableBuilder[Self <: KinIYAlignnumber] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter(value: Double): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait Write extends StObject {
    
    def write(line: String, width: Double, xAlign: IXAlign, xOffset: Double, yOffset: Double): Unit
  }
  object Write {
    
    @scala.inline
    def apply(write: (String, Double, IXAlign, Double, Double) => Unit): Write = {
      val __obj = js.Dynamic.literal(write = js.Any.fromFunction5(write))
      __obj.asInstanceOf[Write]
    }
    
    @scala.inline
    implicit class WriteMutableBuilder[Self <: Write] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWrite(value: (String, Double, IXAlign, Double, Double) => Unit): Self = StObject.set(x, "write", js.Any.fromFunction5(value))
    }
  }
}
