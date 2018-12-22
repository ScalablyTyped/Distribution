package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AttributeType extends js.Object

/**
     * Constant Enum: Attribute types for {@link Attributes.Attribute.setDisplayState()}.
     * @see {@link Xrm.Attributes.AttributeType}
     */
@JSGlobal("XrmEnum.AttributeType")
@js.native
object AttributeType extends js.Object {
  @js.native
  sealed trait Boolean
    extends xrmLib.XrmEnumNs.AttributeType
  
  @js.native
  sealed trait DateTime
    extends xrmLib.XrmEnumNs.AttributeType
  
  @js.native
  sealed trait Decimal
    extends xrmLib.XrmEnumNs.AttributeType
  
  @js.native
  sealed trait Double
    extends xrmLib.XrmEnumNs.AttributeType
  
  @js.native
  sealed trait Integer
    extends xrmLib.XrmEnumNs.AttributeType
  
  @js.native
  sealed trait Lookup
    extends xrmLib.XrmEnumNs.AttributeType
  
  @js.native
  sealed trait Memo
    extends xrmLib.XrmEnumNs.AttributeType
  
  @js.native
  sealed trait Money
    extends xrmLib.XrmEnumNs.AttributeType
  
  @js.native
  sealed trait MultiOptionSet
    extends xrmLib.XrmEnumNs.AttributeType
  
  @js.native
  sealed trait OptionSet
    extends xrmLib.XrmEnumNs.AttributeType
  
  @js.native
  sealed trait String
    extends xrmLib.XrmEnumNs.AttributeType
  
  /* "boolean" */ val Boolean: Boolean with java.lang.String = js.native
  /* "datetime" */ val DateTime: DateTime with java.lang.String = js.native
  /* "decimal" */ val Decimal: Decimal with java.lang.String = js.native
  /* "double" */ val Double: Double with java.lang.String = js.native
  /* "integer" */ val Integer: Integer with java.lang.String = js.native
  /* "lookup" */ val Lookup: Lookup with java.lang.String = js.native
  /* "memo" */ val Memo: Memo with java.lang.String = js.native
  /* "money" */ val Money: Money with java.lang.String = js.native
  /* "multioptionset" */ val MultiOptionSet: MultiOptionSet with java.lang.String = js.native
  /* "optionset" */ val OptionSet: OptionSet with java.lang.String = js.native
  /* "string" */ val String: String with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[xrmLib.XrmEnumNs.AttributeType with java.lang.String] = js.native
}

