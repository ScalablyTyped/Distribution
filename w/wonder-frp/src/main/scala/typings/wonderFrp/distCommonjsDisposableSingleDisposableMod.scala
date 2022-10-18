package typings.wonderFrp

import typings.wonderFrp.distCommonjsCoreEntityMod.Entity
import typings.wonderFrp.distCommonjsDisposableIdisposableMod.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsDisposableSingleDisposableMod {
  
  @JSImport("wonder-frp/dist/commonjs/Disposable/SingleDisposable", "SingleDisposable")
  @js.native
  open class SingleDisposable protected ()
    extends Entity
       with IDisposable {
    def this(dispose: js.Function) = this()
    def this(dispose: IDisposable) = this()
    
    /* private */ var _disposable: Any = js.native
    
    /* private */ var _isDisposed: Any = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    def setDispose(disposable: IDisposable): Unit = js.native
  }
  /* static members */
  object SingleDisposable {
    
    @JSImport("wonder-frp/dist/commonjs/Disposable/SingleDisposable", "SingleDisposable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): SingleDisposable = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[SingleDisposable]
    inline def create(dispose: js.Function): SingleDisposable = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(dispose.asInstanceOf[js.Any]).asInstanceOf[SingleDisposable]
    inline def create(dispose: IDisposable): SingleDisposable = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(dispose.asInstanceOf[js.Any]).asInstanceOf[SingleDisposable]
  }
}
