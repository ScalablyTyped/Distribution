package typings
package wonderDashFrpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/binding/nodejs/NodeOperator", JSImport.Namespace)
@js.native
object distEs2015BindingNodejsNodeOperatorMod extends js.Object {
  var fromNodeCallback: js.Function2[
    /* func */ js.Function, 
    /* context */ js.UndefOr[js.Any], 
    js.Function1[
      /* repeated */ js.Any, 
      wonderDashFrpLib.distEs2015StreamAnonymousStreamMod.AnonymousStream
    ]
  ] = js.native
  var fromReadableStream: js.Function1[
    /* stream */ js.Any, 
    wonderDashFrpLib.distEs2015StreamAnonymousStreamMod.AnonymousStream
  ] = js.native
  var fromStream: js.Function2[
    /* stream */ js.Any, 
    /* finishEventName */ js.UndefOr[java.lang.String], 
    wonderDashFrpLib.distEs2015StreamAnonymousStreamMod.AnonymousStream
  ] = js.native
  var fromTransformStream: js.Function1[
    /* stream */ js.Any, 
    wonderDashFrpLib.distEs2015StreamAnonymousStreamMod.AnonymousStream
  ] = js.native
  var fromWritableStream: js.Function1[
    /* stream */ js.Any, 
    wonderDashFrpLib.distEs2015StreamAnonymousStreamMod.AnonymousStream
  ] = js.native
}

