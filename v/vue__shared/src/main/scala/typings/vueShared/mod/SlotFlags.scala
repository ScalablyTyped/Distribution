package typings.vueShared.mod

import typings.vueShared.vueSharedNumbers.`1`
import typings.vueShared.vueSharedNumbers.`2`
import typings.vueShared.vueSharedNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vueShared.vueSharedNumbers.`1`
  - typings.vueShared.vueSharedNumbers.`2`
  - typings.vueShared.vueSharedNumbers.`3`
*/
trait SlotFlags extends js.Object
object SlotFlags {
  
  /**
    * Slots that reference scope variables (v-for or an outer slot prop), or
    * has conditional structure (v-if, v-for). The parent will need to force
    * the child to update because the slot does not fully capture its dependencies.
    */
  @scala.inline
  def DYNAMIC: `2` = 2.asInstanceOf[`2`]
  
  /**
    * `<slot/>` being forwarded into a child component. Whether the parent needs
    * to update the child is dependent on what kind of slots the parent itself
    * received. This has to be refined at runtime, when the child's vnode
    * is being created (in `normalizeChildren`)
    */
  @scala.inline
  def FORWARDED: `3` = 3.asInstanceOf[`3`]
  
  /**
    * Stable slots that only reference slot props or context state. The slot
    * can fully capture its own dependencies so when passed down the parent won't
    * need to force the child to update.
    */
  @scala.inline
  def STABLE: `1` = 1.asInstanceOf[`1`]
}
