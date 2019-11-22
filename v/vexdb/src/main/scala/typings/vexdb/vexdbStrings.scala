package typings.vexdb

import typings.vexdb.outConstantsRequestObjectsMod.Endpoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object vexdbStrings {
  @js.native
  sealed trait awards extends Endpoint
  
  @js.native
  sealed trait events extends Endpoint
  
  @js.native
  sealed trait fetch extends js.Object
  
  @js.native
  sealed trait item extends js.Object
  
  @js.native
  sealed trait matches extends Endpoint
  
  @js.native
  sealed trait prefetch extends js.Object
  
  @js.native
  sealed trait rankings extends Endpoint
  
  @js.native
  sealed trait season_rankings extends Endpoint
  
  @js.native
  sealed trait skills extends Endpoint
  
  @js.native
  sealed trait teams extends Endpoint
  
  @scala.inline
  def awards: awards = "awards".asInstanceOf[awards]
  @scala.inline
  def events: events = "events".asInstanceOf[events]
  @scala.inline
  def fetch: fetch = "fetch".asInstanceOf[fetch]
  @scala.inline
  def item: item = "item".asInstanceOf[item]
  @scala.inline
  def matches: matches = "matches".asInstanceOf[matches]
  @scala.inline
  def prefetch: prefetch = "prefetch".asInstanceOf[prefetch]
  @scala.inline
  def rankings: rankings = "rankings".asInstanceOf[rankings]
  @scala.inline
  def season_rankings: season_rankings = "season_rankings".asInstanceOf[season_rankings]
  @scala.inline
  def skills: skills = "skills".asInstanceOf[skills]
  @scala.inline
  def teams: teams = "teams".asInstanceOf[teams]
}

