package typings.tileReduce

import typings.tileReduce.TileReduce.Types
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object tileReduceStrings {
  @js.native
  sealed trait end extends Types
  
  @js.native
  sealed trait map extends Types
  
  @js.native
  sealed trait reduce extends Types
  
  @js.native
  sealed trait start extends Types
  
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  @scala.inline
  def map: map = "map".asInstanceOf[map]
  @scala.inline
  def reduce: reduce = "reduce".asInstanceOf[reduce]
  @scala.inline
  def start: start = "start".asInstanceOf[start]
}

