package typings.victoryZoomContainer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait X extends StObject {
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object X {
    
    inline def apply(): X = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait XY extends StObject {
    
    var x: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomainTuple */ Any
      ] = js.undefined
    
    var y: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomainTuple */ Any
      ] = js.undefined
  }
  object XY {
    
    inline def apply(): XY = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XY]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XY] (val x: Self) extends AnyVal {
      
      inline def setX(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomainTuple */ Any
      ): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomainTuple */ Any
      ): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait Y extends StObject {
    
    var x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomainTuple */ Any
    
    var y: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomainTuple */ Any
  }
  object Y {
    
    inline def apply(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomainTuple */ Any,
      y: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomainTuple */ Any
    ): Y = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Y]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Y] (val x: Self) extends AnyVal {
      
      inline def setX(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomainTuple */ Any
      ): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomainTuple */ Any
      ): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
