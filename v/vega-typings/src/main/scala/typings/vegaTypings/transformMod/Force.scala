package typings.vegaTypings.transformMod

import typings.vegaTypings.vegaTypingsStrings.center
import typings.vegaTypings.vegaTypingsStrings.collide
import typings.vegaTypings.vegaTypingsStrings.link
import typings.vegaTypings.vegaTypingsStrings.nbody
import typings.vegaTypings.vegaTypingsStrings.x
import typings.vegaTypings.vegaTypingsStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.transformMod.ForceCenter
  - typings.vegaTypings.transformMod.ForceCollide
  - typings.vegaTypings.transformMod.ForceLink
  - typings.vegaTypings.transformMod.ForceNBody
  - typings.vegaTypings.transformMod.ForceX
  - typings.vegaTypings.transformMod.ForceY
*/
trait Force extends js.Object

object Force {
  @scala.inline
  def ForceX(force: x): Force = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
    __obj.asInstanceOf[Force]
  }
  @scala.inline
  def ForceCenter(force: center): Force = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
    __obj.asInstanceOf[Force]
  }
  @scala.inline
  def ForceCollide(force: collide): Force = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
    __obj.asInstanceOf[Force]
  }
  @scala.inline
  def ForceY(force: y): Force = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
    __obj.asInstanceOf[Force]
  }
  @scala.inline
  def ForceNBody(force: nbody): Force = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
    __obj.asInstanceOf[Force]
  }
  @scala.inline
  def ForceLink(force: link): Force = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
    __obj.asInstanceOf[Force]
  }
}

