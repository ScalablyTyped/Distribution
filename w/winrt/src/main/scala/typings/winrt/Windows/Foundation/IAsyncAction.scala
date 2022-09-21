package typings.winrt.Windows.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAsyncAction
  extends StObject
     with IAsyncInfo {
  
  def completed(asyncInfo: IAsyncAction, asyncStatus: AsyncStatus): Unit = js.native
  @JSName("completed")
  var completed_Original: AsyncActionCompletedHandler = js.native
  
  var done: js.UndefOr[
    js.Function3[
      /* success */ js.UndefOr[js.Function0[Any]], 
      /* error */ js.UndefOr[js.Function1[/* error */ Any, Any]], 
      /* progress */ js.UndefOr[js.Function1[/* progress */ Any, Unit]], 
      Unit
    ]
  ] = js.native
  
  def getResults(): Unit = js.native
  
  def `then`[U](): Any = js.native
  def `then`[U](
    success: js.Function0[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPromise<U> */ Any) | U
    ]
  ): Any = js.native
  def `then`[U](
    success: js.Function0[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPromise<U> */ Any) | U
    ],
    error: js.Function1[
      /* error */ Any, 
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPromise<U> */ Any) | U
    ]
  ): Any = js.native
  def `then`[U](
    success: js.Function0[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPromise<U> */ Any) | U
    ],
    error: js.Function1[
      /* error */ Any, 
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPromise<U> */ Any) | U
    ],
    progress: js.Function1[/* progress */ Any, Unit]
  ): Any = js.native
  def `then`[U](
    success: js.Function0[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPromise<U> */ Any) | U
    ],
    error: Unit,
    progress: js.Function1[/* progress */ Any, Unit]
  ): Any = js.native
  def `then`[U](
    success: Unit,
    error: js.Function1[
      /* error */ Any, 
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPromise<U> */ Any) | U
    ]
  ): Any = js.native
  def `then`[U](
    success: Unit,
    error: js.Function1[
      /* error */ Any, 
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPromise<U> */ Any) | U
    ],
    progress: js.Function1[/* progress */ Any, Unit]
  ): Any = js.native
  def `then`[U](success: Unit, error: Unit, progress: js.Function1[/* progress */ Any, Unit]): Any = js.native
}
