package typings.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContributionPropertyType extends js.Object
@JSImport("vso-node-api/interfaces/ExtensionManagementInterfaces", "ContributionPropertyType")
@js.native
object ContributionPropertyType extends js.Object {
  
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ContributionPropertyType with scala.Double] = js.native
  
  /**
    * Value is an array
    */
  @js.native
  sealed trait Array extends ContributionPropertyType
  /* 256 */ @js.native
  object Array
    extends TopLevel[Array with scala.Double]
  
  /**
    * Value is True or False
    */
  @js.native
  sealed trait Boolean extends ContributionPropertyType
  /* 8 */ @js.native
  object Boolean
    extends TopLevel[Boolean with scala.Double]
  
  /**
    * Value is a DateTime object
    */
  @js.native
  sealed trait DateTime extends ContributionPropertyType
  /* 64 */ @js.native
  object DateTime
    extends TopLevel[DateTime with scala.Double]
  
  /**
    * Value is a generic Dictionary/JObject/property bag
    */
  @js.native
  sealed trait Dictionary extends ContributionPropertyType
  /* 128 */ @js.native
  object Dictionary
    extends TopLevel[Dictionary with scala.Double]
  
  /**
    * Value is a double
    */
  @js.native
  sealed trait Double extends ContributionPropertyType
  /* 32 */ @js.native
  object Double
    extends TopLevel[Double with scala.Double]
  
  /**
    * Value is a GUID
    */
  @js.native
  sealed trait Guid extends ContributionPropertyType
  /* 4 */ @js.native
  object Guid
    extends TopLevel[Guid with scala.Double]
  
  /**
    * Value is an integer
    */
  @js.native
  sealed trait Integer extends ContributionPropertyType
  /* 16 */ @js.native
  object Integer
    extends TopLevel[Integer with scala.Double]
  
  /**
    * Value is an arbitrary/custom object
    */
  @js.native
  sealed trait Object extends ContributionPropertyType
  /* 512 */ @js.native
  object Object
    extends TopLevel[Object with scala.Double]
  
  /**
    * Value is a string
    */
  @js.native
  sealed trait String extends ContributionPropertyType
  /* 1 */ @js.native
  object String
    extends TopLevel[String with scala.Double]
  
  /**
    * Contribution type is unknown (value may be anything)
    */
  @js.native
  sealed trait Unknown extends ContributionPropertyType
  /* 0 */ @js.native
  object Unknown
    extends TopLevel[Unknown with scala.Double]
  
  /**
    * Value is a Uri
    */
  @js.native
  sealed trait Uri extends ContributionPropertyType
  /* 2 */ @js.native
  object Uri
    extends TopLevel[Uri with scala.Double]
}
