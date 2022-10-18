package typings.wonderFrp

import typings.wonderFrp.distEs2015CoreObserverMod.Observer
import typings.wonderFrp.distEs2015DisposableIdisposableMod.IDisposable
import typings.wonderFrp.distEs2015ObserverIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015ObserverSubjectObserverMod {
  
  @JSImport("wonder-frp/dist/es2015/observer/SubjectObserver", "SubjectObserver")
  @js.native
  open class SubjectObserver ()
    extends StObject
       with IObserver {
    
    /* private */ var _disposable: Any = js.native
    
    def addChild(observer: Observer): Unit = js.native
    
    /* CompleteClass */
    override def completed(): Any = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /* CompleteClass */
    override def error(error: Any): Any = js.native
    
    def isEmpty(): Boolean = js.native
    
    /* CompleteClass */
    override def next(value: Any): Any = js.native
    
    var observers: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<IObserver> */ Any = js.native
    
    def removeChild(observer: Observer): Unit = js.native
    
    def setDisposable(disposable: IDisposable): Unit = js.native
  }
}
