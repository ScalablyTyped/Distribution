package typings.tstl.baseContainerIDequeContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _IPushFront<T> * / any */ trait _IDeque[T] extends js.Object {
  /**
    * Erase the first element.
    */
  def pop_front(): Unit
  /**
    * @inheritDoc
    */
  def push_front(`val`: T): Unit
}

object _IDeque {
  @scala.inline
  def apply[T](pop_front: () => Unit, push_front: T => Unit): _IDeque[T] = {
    val __obj = js.Dynamic.literal(pop_front = js.Any.fromFunction0(pop_front), push_front = js.Any.fromFunction1(push_front))
  
    __obj.asInstanceOf[_IDeque[T]]
  }
}

