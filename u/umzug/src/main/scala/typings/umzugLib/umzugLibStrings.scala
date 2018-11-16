package typings
package umzugLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object umzugLibStrings {
  @js.native
  sealed trait json extends js.Object
  
  @js.native
  sealed trait migrated extends js.Object
  
  @js.native
  sealed trait migrating extends js.Object
  
  @js.native
  sealed trait mongodb extends js.Object
  
  @js.native
  sealed trait reverted extends js.Object
  
  @js.native
  sealed trait reverting extends js.Object
  
  @js.native
  sealed trait sequelize extends js.Object
  
  def json: json = "json".asInstanceOf[json]
  def migrated: migrated = "migrated".asInstanceOf[migrated]
  def migrating: migrating = "migrating".asInstanceOf[migrating]
  def mongodb: mongodb = "mongodb".asInstanceOf[mongodb]
  def reverted: reverted = "reverted".asInstanceOf[reverted]
  def reverting: reverting = "reverting".asInstanceOf[reverting]
  def sequelize: sequelize = "sequelize".asInstanceOf[sequelize]
}

