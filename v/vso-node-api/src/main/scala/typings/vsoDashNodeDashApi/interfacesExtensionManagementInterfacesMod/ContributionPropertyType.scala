package typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContributionPropertyType extends js.Object

@JSImport("vso-node-api/interfaces/ExtensionManagementInterfaces", "ContributionPropertyType")
@js.native
object ContributionPropertyType extends js.Object {
  /**
    * Value is an array
    */
  @js.native
  sealed trait Array extends ContributionPropertyType
  
  /**
    * Value is True or False
    */
  @js.native
  sealed trait Boolean extends ContributionPropertyType
  
  /**
    * Value is a DateTime object
    */
  @js.native
  sealed trait DateTime extends ContributionPropertyType
  
  /**
    * Value is a generic Dictionary/JObject/property bag
    */
  @js.native
  sealed trait Dictionary extends ContributionPropertyType
  
  /**
    * Value is a double
    */
  @js.native
  sealed trait Double extends ContributionPropertyType
  
  /**
    * Value is a GUID
    */
  @js.native
  sealed trait Guid extends ContributionPropertyType
  
  /**
    * Value is an integer
    */
  @js.native
  sealed trait Integer extends ContributionPropertyType
  
  /**
    * Value is an arbitrary/custom object
    */
  @js.native
  sealed trait Object extends ContributionPropertyType
  
  /**
    * Value is a string
    */
  @js.native
  sealed trait String extends ContributionPropertyType
  
  /**
    * Contribution type is unknown (value may be anything)
    */
  @js.native
  sealed trait Unknown extends ContributionPropertyType
  
  /**
    * Value is a Uri
    */
  @js.native
  sealed trait Uri extends ContributionPropertyType
  
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ContributionPropertyType with scala.Double] = js.native
  /* 256 */ @js.native
  object Array
    extends TopLevel[Array with scala.Double]
  
  /* 8 */ @js.native
  object Boolean
    extends TopLevel[Boolean with scala.Double]
  
  /* 64 */ @js.native
  object DateTime
    extends TopLevel[DateTime with scala.Double]
  
  /* 128 */ @js.native
  object Dictionary
    extends TopLevel[Dictionary with scala.Double]
  
  /* 32 */ @js.native
  object Double
    extends TopLevel[Double with scala.Double]
  
  /* 4 */ @js.native
  object Guid
    extends TopLevel[Guid with scala.Double]
  
  /* 16 */ @js.native
  object Integer
    extends TopLevel[Integer with scala.Double]
  
  /* 512 */ @js.native
  object Object
    extends TopLevel[Object with scala.Double]
  
  /* 1 */ @js.native
  object String
    extends TopLevel[String with scala.Double]
  
  /* 0 */ @js.native
  object Unknown
    extends TopLevel[Unknown with scala.Double]
  
  /* 2 */ @js.native
  object Uri
    extends TopLevel[Uri with scala.Double]
  
}

