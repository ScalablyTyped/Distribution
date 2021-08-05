package typings.wonderFrp

import typings.wonderFrp.anonymousStreamMod.AnonymousStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeOperatorMod {
  
  @JSImport("wonder-frp/dist/commonjs/binding/nodejs/NodeOperator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wonder-frp/dist/commonjs/binding/nodejs/NodeOperator", "fromNodeCallback")
  @js.native
  def fromNodeCallback: js.Function2[
    /* func */ js.Function, 
    /* context */ js.UndefOr[js.Any], 
    js.Function1[/* repeated */ js.Any, AnonymousStream]
  ] = js.native
  inline def fromNodeCallback_=(
    x: js.Function2[
      /* func */ js.Function, 
      /* context */ js.UndefOr[js.Any], 
      js.Function1[/* repeated */ js.Any, AnonymousStream]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromNodeCallback")(x.asInstanceOf[js.Any])
  
  @JSImport("wonder-frp/dist/commonjs/binding/nodejs/NodeOperator", "fromReadableStream")
  @js.native
  def fromReadableStream: js.Function1[/* stream */ js.Any, AnonymousStream] = js.native
  inline def fromReadableStream_=(x: js.Function1[/* stream */ js.Any, AnonymousStream]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromReadableStream")(x.asInstanceOf[js.Any])
  
  @JSImport("wonder-frp/dist/commonjs/binding/nodejs/NodeOperator", "fromStream")
  @js.native
  def fromStream: js.Function2[/* stream */ js.Any, /* finishEventName */ js.UndefOr[String], AnonymousStream] = js.native
  inline def fromStream_=(x: js.Function2[/* stream */ js.Any, /* finishEventName */ js.UndefOr[String], AnonymousStream]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromStream")(x.asInstanceOf[js.Any])
  
  @JSImport("wonder-frp/dist/commonjs/binding/nodejs/NodeOperator", "fromTransformStream")
  @js.native
  def fromTransformStream: js.Function1[/* stream */ js.Any, AnonymousStream] = js.native
  inline def fromTransformStream_=(x: js.Function1[/* stream */ js.Any, AnonymousStream]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromTransformStream")(x.asInstanceOf[js.Any])
  
  @JSImport("wonder-frp/dist/commonjs/binding/nodejs/NodeOperator", "fromWritableStream")
  @js.native
  def fromWritableStream: js.Function1[/* stream */ js.Any, AnonymousStream] = js.native
  inline def fromWritableStream_=(x: js.Function1[/* stream */ js.Any, AnonymousStream]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromWritableStream")(x.asInstanceOf[js.Any])
}
