package typings.wonderFrp

import typings.wonderFrp.coreEntityMod.Entity
import typings.wonderFrp.disposableIdisposableMod.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object disposableSingleDisposableMod {
  
  @JSImport("wonder-frp/dist/es2015/Disposable/SingleDisposable", "SingleDisposable")
  @js.native
  class SingleDisposable protected ()
    extends Entity
       with IDisposable {
    def this(dispose: js.Function) = this()
    def this(dispose: IDisposable) = this()
    
    var _disposable: js.Any = js.native
    
    var _isDisposed: js.Any = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    def setDispose(disposable: IDisposable): Unit = js.native
  }
  /* static members */
  object SingleDisposable {
    
    @JSImport("wonder-frp/dist/es2015/Disposable/SingleDisposable", "SingleDisposable")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(): SingleDisposable = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[SingleDisposable]
    @scala.inline
    def create(dispose: js.Function): SingleDisposable = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(dispose.asInstanceOf[js.Any]).asInstanceOf[SingleDisposable]
    @scala.inline
    def create(dispose: IDisposable): SingleDisposable = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(dispose.asInstanceOf[js.Any]).asInstanceOf[SingleDisposable]
  }
}
