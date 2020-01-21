package typings.unimodulesReactNativeAdapter

import typings.unimodulesReactNativeAdapter.codedErrorMod.CodedError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@unimodules/react-native-adapter/build/errors/UnavailabilityError", JSImport.Namespace)
@js.native
object unavailabilityErrorMod extends js.Object {
  @js.native
  class UnavailabilityError protected () extends CodedError {
    def this(moduleName: String, propertyName: String) = this()
  }
  
}

