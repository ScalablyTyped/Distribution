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
      /* success */ js.UndefOr[js.Function0[js.Any]], 
      /* error */ js.UndefOr[js.Function1[/* error */ js.Any, js.Any]], 
      /* progress */ js.UndefOr[js.Function1[/* progress */ js.Any, Unit]], 
      Unit
    ]
  ] = js.native
  
  def getResults(): Unit = js.native
  
  def `then`[U](): js.Any = js.native
  def `then`[U](
    success: js.Function0[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPromise<U> */ js.Any) | U
    ]
  ): js.Any = js.native
  def `then`[U](
    success: js.Function0[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPromise<U> */ js.Any) | U
    ],
    error: js.Function1[
      /* error */ js.Any, 
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPromise<U> */ js.Any) | U
    ]
  ): js.Any = js.native
  def `then`[U](
    success: js.Function0[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPromise<U> */ js.Any) | U
    ],
    error: js.Function1[
      /* error */ js.Any, 
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPromise<U> */ js.Any) | U
    ],
    progress: js.Function1[/* progress */ js.Any, Unit]
  ): js.Any = js.native
  def `then`[U](
    success: js.Function0[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPromise<U> */ js.Any) | U
    ],
    error: Unit,
    progress: js.Function1[/* progress */ js.Any, Unit]
  ): js.Any = js.native
  def `then`[U](
    success: Unit,
    error: js.Function1[
      /* error */ js.Any, 
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPromise<U> */ js.Any) | U
    ]
  ): js.Any = js.native
  def `then`[U](
    success: Unit,
    error: js.Function1[
      /* error */ js.Any, 
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPromise<U> */ js.Any) | U
    ],
    progress: js.Function1[/* progress */ js.Any, Unit]
  ): js.Any = js.native
  def `then`[U](success: Unit, error: Unit, progress: js.Function1[/* progress */ js.Any, Unit]): js.Any = js.native
}
