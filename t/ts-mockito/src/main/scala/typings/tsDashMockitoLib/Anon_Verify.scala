package typings
package tsDashMockitoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Verify extends js.Object {
  var anyFunction: js.Function0[_]
  var anyNumber: js.Function0[_]
  var anyOfClass: js.Function1[/* expectedClass */ Anon_Args[_], _]
  var anyString: js.Function0[_]
  var anything: js.Function0[_]
  var between: js.Function2[/* min */ scala.Double, /* max */ scala.Double, _]
  var capture: js.Function1[
    /* method */ js.Function1[/* a */ js.Any, _], 
    tsDashMockitoLib.libCaptureArgCaptorMod.ArgCaptor1[_]
  ]
  var deepEqual: js.Function1[/* expectedValue */ js.Any, _]
  var instance: js.Function1[/* mockedValue */ js.Any, _]
  var `match`: js.Function1[/* expectedValue */ stdLib.RegExp | java.lang.String, _]
  var mock: js.Function1[/* clazz */ Anon_Args[_] | (js.Function with js.Object), _]
  var notNull: js.Function0[_]
  var objectContaining: js.Function1[/* expectedValue */ js.Object, _]
  var reset: js.Function1[/* mockedValue */ js.Any, scala.Unit]
  var resetCalls: js.Function1[/* mockedValue */ js.Any, scala.Unit]
  var spy: js.Function1[/* instanceToSpy */ js.Any, _]
  var strictEqual: js.Function1[/* expectedValue */ js.Any, _]
  var verify: js.Function1[
    /* method */ js.Any, 
    tsDashMockitoLib.libMethodStubVerificatorMod.MethodStubVerificator[_]
  ]
  var when: js.Function1[
    /* method */ js.Any, 
    tsDashMockitoLib.libMethodStubSetterMod.MethodStubSetter[_, scala.Unit, scala.Unit]
  ]
}

