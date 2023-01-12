package typings.victoryGroup

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
    
    var categories: Any
    
    var color: Any
    
    var colorScale: Any
    
    var datasets: Any
    
    var domain: X
    
    var horizontal: Any
    
    var offset: Any
    
    var origin: Any
    
    var padding: Bottom
    
    var range: Any
    
    var scale: X
    
    var style: Any
  }
  object Categories {
    
    inline def apply(
      categories: Any,
      color: Any,
      colorScale: Any,
      datasets: Any,
      domain: X,
      horizontal: Any,
      offset: Any,
      origin: Any,
      padding: Bottom,
      range: Any,
      scale: X,
      style: Any
    ): Categories = {
      val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], colorScale = colorScale.asInstanceOf[js.Any], datasets = datasets.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], horizontal = horizontal.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[Categories]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Categories] (val x: Self) extends AnyVal {
      
      inline def setCategories(value: Any): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      inline def setColor(value: Any): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorScale(value: Any): Self = StObject.set(x, "colorScale", value.asInstanceOf[js.Any])
      
      inline def setDatasets(value: Any): Self = StObject.set(x, "datasets", value.asInstanceOf[js.Any])
      
      inline def setDomain(value: X): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setHorizontal(value: Any): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Any): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOrigin(value: Any): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setPadding(value: Bottom): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setRange(value: Any): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setScale(value: X): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.D3Scale<any> */ Any
    
    var y: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.D3Scale<any> */ Any
  }
  object X {
    
    inline def apply(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.D3Scale<any> */ Any,
      y: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.D3Scale<any> */ Any
    ): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      inline def setX(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.D3Scale<any> */ Any
      ): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.D3Scale<any> */ Any
      ): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
