package typings.wonderFrp

import typings.wonderFrp.coreEntityMod.Entity
import typings.wonderFrp.disposableIdisposableMod.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object disposableGroupDisposableMod {
  
  @JSImport("wonder-frp/dist/es2015/Disposable/GroupDisposable", "GroupDisposable")
  @js.native
  open class GroupDisposable ()
    extends Entity
       with IDisposable {
    def this(disposable: IDisposable) = this()
    
    /* private */ var _group: Any = js.native
    
    /* private */ var _isDisposed: Any = js.native
    
    def add(disposable: IDisposable): this.type = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    def getCount(): Double = js.native
    
    def remove(disposable: IDisposable): this.type = js.native
  }
  /* static members */
  object GroupDisposable {
    
    @JSImport("wonder-frp/dist/es2015/Disposable/GroupDisposable", "GroupDisposable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): GroupDisposable = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[GroupDisposable]
    inline def create(disposable: IDisposable): GroupDisposable = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(disposable.asInstanceOf[js.Any]).asInstanceOf[GroupDisposable]
  }
}
