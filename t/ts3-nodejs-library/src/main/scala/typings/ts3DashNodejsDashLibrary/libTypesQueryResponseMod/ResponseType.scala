package typings.ts3DashNodejsDashLibrary.libTypesQueryResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ResponseType extends js.Object

@JSImport("ts3-nodejs-library/lib/types/QueryResponse", "ResponseType")
@js.native
object ResponseType extends js.Object {
  @js.native
  sealed trait ARRAY_OF_NUMBER extends ResponseType
  
  @js.native
  sealed trait ARRAY_OF_STRING extends ResponseType
  
  @js.native
  sealed trait NUMBER extends ResponseType
  
  @js.native
  sealed trait STRING extends ResponseType
  
  /* 3 */ val ARRAY_OF_NUMBER: typings.ts3DashNodejsDashLibrary.libTypesQueryResponseMod.ResponseType.ARRAY_OF_NUMBER with Double = js.native
  /* 2 */ val ARRAY_OF_STRING: typings.ts3DashNodejsDashLibrary.libTypesQueryResponseMod.ResponseType.ARRAY_OF_STRING with Double = js.native
  /* 1 */ val NUMBER: typings.ts3DashNodejsDashLibrary.libTypesQueryResponseMod.ResponseType.NUMBER with Double = js.native
  /* 0 */ val STRING: typings.ts3DashNodejsDashLibrary.libTypesQueryResponseMod.ResponseType.STRING with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ResponseType with Double] = js.native
}

