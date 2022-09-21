package typings.tizentvWebideCommonTizentv

import typings.tizentvWebideCommonTizentv.mod.ItemType
import typings.tizentvWebideCommonTizentv.mod.PrivilegeLevel
import typings.tizentvWebideCommonTizentv.mod.SamsungPrivilegeLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tizentvWebideCommonTizentvStrings {
  
  @js.native
  sealed trait Partner
    extends StObject
       with SamsungPrivilegeLevel
  inline def Partner: Partner = "Partner".asInstanceOf[Partner]
  
  @js.native
  sealed trait Public
    extends StObject
       with SamsungPrivilegeLevel
  inline def Public: Public = "Public".asInstanceOf[Public]
  
  @js.native
  sealed trait author
    extends StObject
       with ItemType
  inline def author: author = "author".asInstanceOf[author]
  
  @js.native
  sealed trait distributor1
    extends StObject
       with ItemType
  inline def distributor1: distributor1 = "distributor1".asInstanceOf[distributor1]
  
  @js.native
  sealed trait distributor2
    extends StObject
       with ItemType
  inline def distributor2: distributor2 = "distributor2".asInstanceOf[distributor2]
  
  @js.native
  sealed trait partner_
    extends StObject
       with PrivilegeLevel
  inline def partner_ : partner_ = "partner".asInstanceOf[partner_]
  
  @js.native
  sealed trait public_
    extends StObject
       with PrivilegeLevel
  inline def public_ : public_ = "public".asInstanceOf[public_]
}
