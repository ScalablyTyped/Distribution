package typings.wonderFrp

import typings.wonderFrp.coreEntityMod.Entity
import typings.wonderFrp.disposableIdisposableMod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/Disposable/GroupDisposable", JSImport.Namespace)
@js.native
object disposableGroupDisposableMod extends js.Object {
  @js.native
  class GroupDisposable ()
    extends Entity
       with IDisposable {
    def this(disposable: IDisposable) = this()
    var _group: js.Any = js.native
    var _isDisposed: js.Any = js.native
    def add(disposable: IDisposable): this.type = js.native
    /* CompleteClass */
    override def dispose(): Unit = js.native
    def getCount(): Double = js.native
    def remove(disposable: IDisposable): this.type = js.native
  }
  
  /* static members */
  @js.native
  object GroupDisposable extends js.Object {
    def create(): GroupDisposable = js.native
    def create(disposable: IDisposable): GroupDisposable = js.native
  }
  
}

