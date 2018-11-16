package typings
package yeomanDashTestLib.yeomanDashTestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunContextConstructor
  extends /**
	 * This class provide a run context object to façade the complexity involved in setting
	 * up a generator for testing
	 * @param Generator - Namespace or generator constructor. If the later
	 *                                      is provided, then namespace is assumed to be
	 *                                      'gen:test' in all cases
	 */
ScalablyTyped.runtime.Instantiable1[
      (/* Generator */ java.lang.String) | (/* Generator */ Constructor[yeomanDashGeneratorLib.yeomanDashGeneratorMod.namespaced]), 
      RunContext
    ]
     with /**
	 * This class provide a run context object to façade the complexity involved in setting
	 * up a generator for testing
	 * @param Generator - Namespace or generator constructor. If the later
	 *                                      is provided, then namespace is assumed to be
	 *                                      'gen:test' in all cases
	 */
ScalablyTyped.runtime.Instantiable2[
      (/* Generator */ java.lang.String) | (/* Generator */ Constructor[yeomanDashGeneratorLib.yeomanDashGeneratorMod.namespaced]), 
      /* settings */ RunContextSettings, 
      RunContext
    ]

