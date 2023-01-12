package typings.victoryChart

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bottom extends StObject {
    
    var bottom: Any
    
    var left: Any
    
    var right: Any
    
    var top: Any
  }
  object Bottom {
    
    inline def apply(bottom: Any, left: Any, right: Any, top: Any): Bottom = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bottom]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Bottom] (val x: Self) extends AnyVal {
      
      inline def setBottom(value: Any): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Any): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Any): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Any): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait Categories extends StObject {
    
    var categories: X
    
    var domain: X
    
    var horizontal: Any
    
    var origin: Y
    
    var padding: Bottom
    
    var range: X
    
    var scale: X
    
    var stringMap: X
    
    var style: Parent
  }
  object Categories {
    
    inline def apply(
      categories: X,
      domain: X,
      horizontal: Any,
      origin: Y,
      padding: Bottom,
      range: X,
      scale: X,
      stringMap: X,
      style: Parent
    ): Categories = {
      val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], horizontal = horizontal.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], stringMap = stringMap.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[Categories]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Categories] (val x: Self) extends AnyVal {
      
      inline def setCategories(value: X): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      inline def setDomain(value: X): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setHorizontal(value: Any): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setOrigin(value: Y): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setPadding(value: Bottom): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setRange(value: X): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setScale(value: X): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setStringMap(value: X): Self = StObject.set(x, "stringMap", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: Parent): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  trait Parent extends StObject {
    
    var parent: Any
  }
  object Parent {
    
    inline def apply(parent: Any): Parent = {
      val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Parent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Parent] (val x: Self) extends AnyVal {
      
      inline def setParent(value: Any): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleInterface * / any, 'parent'> & {  background :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleObject * / any | undefined} */
  trait Pickanyparentbackgroundan extends StObject {
    
    var background: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleObject */ Any
      ] = js.undefined
    
    var parent: js.UndefOr[Any] = js.undefined
  }
  object Pickanyparentbackgroundan {
    
    inline def apply(): Pickanyparentbackgroundan = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Pickanyparentbackgroundan]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Pickanyparentbackgroundan] (val x: Self) extends AnyVal {
      
      inline def setBackground(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleObject */ Any
      ): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setParent(value: Any): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    }
  }
  
  trait X extends StObject {
    
    var x: Any
    
    var y: Any
  }
  object X {
    
    inline def apply(x: Any, y: Any): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      inline def setX(value: Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Any): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Y extends StObject {
    
    var x: Double | js.Date
    
    var y: Double | js.Date
  }
  object Y {
    
    inline def apply(x: Double | js.Date, y: Double | js.Date): Y = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Y]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Y] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double | js.Date): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double | js.Date): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
