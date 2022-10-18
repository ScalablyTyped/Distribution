package typings.svelte

import typings.svelte.typesRuntimeStoreMod.Readable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRuntimeMotionSpringMod {
  
  @JSImport("svelte/types/runtime/motion/spring", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def spring[T](): Spring_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("spring")().asInstanceOf[Spring_[T]]
  inline def spring[T](value: T): Spring_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("spring")(value.asInstanceOf[js.Any]).asInstanceOf[Spring_[T]]
  inline def spring[T](value: T, opts: SpringOpts): Spring_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("spring")(value.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Spring_[T]]
  inline def spring[T](value: Unit, opts: SpringOpts): Spring_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("spring")(value.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Spring_[T]]
  
  trait SpringOpts extends StObject {
    
    var damping: js.UndefOr[Double] = js.undefined
    
    var precision: js.UndefOr[Double] = js.undefined
    
    var stiffness: js.UndefOr[Double] = js.undefined
  }
  object SpringOpts {
    
    inline def apply(): SpringOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpringOpts]
    }
    
    extension [Self <: SpringOpts](x: Self) {
      
      inline def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
      
      inline def setDampingUndefined: Self = StObject.set(x, "damping", js.undefined)
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setStiffness(value: Double): Self = StObject.set(x, "stiffness", value.asInstanceOf[js.Any])
      
      inline def setStiffnessUndefined: Self = StObject.set(x, "stiffness", js.undefined)
    }
  }
  
  trait SpringUpdateOpts extends StObject {
    
    var hard: js.UndefOr[Any] = js.undefined
    
    var soft: js.UndefOr[String | Double | Boolean] = js.undefined
  }
  object SpringUpdateOpts {
    
    inline def apply(): SpringUpdateOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpringUpdateOpts]
    }
    
    extension [Self <: SpringUpdateOpts](x: Self) {
      
      inline def setHard(value: Any): Self = StObject.set(x, "hard", value.asInstanceOf[js.Any])
      
      inline def setHardUndefined: Self = StObject.set(x, "hard", js.undefined)
      
      inline def setSoft(value: String | Double | Boolean): Self = StObject.set(x, "soft", value.asInstanceOf[js.Any])
      
      inline def setSoftUndefined: Self = StObject.set(x, "soft", js.undefined)
    }
  }
  
  @js.native
  trait Spring_[T]
    extends StObject
       with Readable_[T] {
    
    var damping: Double = js.native
    
    var precision: Double = js.native
    
    def set(new_value: T): js.Promise[Unit] = js.native
    def set(new_value: T, opts: SpringUpdateOpts): js.Promise[Unit] = js.native
    
    var stiffness: Double = js.native
    
    def update(fn: Updater[T]): js.Promise[Unit] = js.native
    def update(fn: Updater[T], opts: SpringUpdateOpts): js.Promise[Unit] = js.native
  }
  
  type Updater[T] = js.Function2[/* target_value */ T, /* value */ T, T]
}
