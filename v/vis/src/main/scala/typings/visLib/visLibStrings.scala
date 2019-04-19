package typings
package visLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object visLibStrings {
  @js.native
  sealed trait Array extends js.Object
  
  @js.native
  sealed trait Object extends js.Object
  
  @js.native
  sealed trait afterDrawing
    extends visLib.visMod.NetworkEvents
  
  @js.native
  sealed trait animationFinished
    extends visLib.visMod.NetworkEvents
  
  @js.native
  sealed trait auto
    extends visLib.visMod.TimelineAlignType
  
  @js.native
  sealed trait axis
    extends visLib.visMod.TimelineEventPropertiesResultWhatType
  
  @js.native
  sealed trait background
    extends visLib.visMod.TimelineEventPropertiesResultWhatType
       with visLib.visMod.TimelineItemType
  
  @js.native
  sealed trait bar
    extends visLib.visMod.Graph2dStyleType
  
  @js.native
  sealed trait beforeDrawing
    extends visLib.visMod.NetworkEvents
  
  @js.native
  sealed trait blurEdge
    extends visLib.visMod.NetworkEvents
  
  @js.native
  sealed trait blurNode
    extends visLib.visMod.NetworkEvents
  
  @js.native
  sealed trait bottom
    extends visLib.visMod.TopBottomEnumType
  
  @js.native
  sealed trait `bottom-left`
    extends visLib.visMod.LegendPositionType
  
  @js.native
  sealed trait `bottom-right`
    extends visLib.visMod.LegendPositionType
  
  @js.native
  sealed trait box
    extends visLib.visMod.TimelineItemType
  
  @js.native
  sealed trait cap extends js.Object
  
  @js.native
  sealed trait center
    extends visLib.visMod.Graph2dBarChartAlign
       with visLib.visMod.TimelineAlignType
  
  @js.native
  sealed trait centripetal
    extends visLib.visMod.ParametrizationInterpolationType
  
  @js.native
  sealed trait changed
    extends visLib.visMod.TimelineEvents
  
  @js.native
  sealed trait chordal
    extends visLib.visMod.ParametrizationInterpolationType
  
  @js.native
  sealed trait circle
    extends visLib.visMod.Graph2dDrawPointsStyle
  
  @js.native
  sealed trait click
    extends visLib.visMod.NetworkEvents
       with visLib.visMod.TimelineEvents
  
  @js.native
  sealed trait configChange
    extends visLib.visMod.NetworkEvents
  
  @js.native
  sealed trait contextmenu
    extends visLib.visMod.TimelineEvents
  
  @js.native
  sealed trait `current-time`
    extends visLib.visMod.TimelineEventPropertiesResultWhatType
  
  @js.native
  sealed trait currentTimeTick
    extends visLib.visMod.TimelineEvents
  
  @js.native
  sealed trait `custom-time`
    extends visLib.visMod.TimelineEventPropertiesResultWhatType
  
  @js.native
  sealed trait daily extends js.Object
  
  @js.native
  sealed trait day
    extends visLib.visMod.TimelineTimeAxisScaleType
  
  @js.native
  sealed trait deselectEdge
    extends visLib.visMod.NetworkEvents
  
  @js.native
  sealed trait deselectNode
    extends visLib.visMod.NetworkEvents
  
  @js.native
  sealed trait disabled
    extends visLib.visMod.ParametrizationInterpolationType
  
  @js.native
  sealed trait doubleClick
    extends visLib.visMod.NetworkEvents
       with visLib.visMod.TimelineEvents
  
  @js.native
  sealed trait dragEnd
    extends visLib.visMod.NetworkEvents
  
  @js.native
  sealed trait dragStart
    extends visLib.visMod.NetworkEvents
  
  @js.native
  sealed trait dragging
    extends visLib.visMod.NetworkEvents
  
  @js.native
  sealed trait drop
    extends visLib.visMod.TimelineEvents
  
  @js.native
  sealed trait easeInCubic
    extends visLib.visMod.EasingFunction
  
  @js.native
  sealed trait easeInOutCubic
    extends visLib.visMod.EasingFunction
  
  @js.native
  sealed trait easeInOutQuad
    extends visLib.visMod.EasingFunction
  
  @js.native
  sealed trait easeInOutQuart
    extends visLib.visMod.EasingFunction
  
  @js.native
  sealed trait easeInOutQuint
    extends visLib.visMod.EasingFunction
  
  @js.native
  sealed trait easeInQuad
    extends visLib.visMod.EasingFunction
  
  @js.native
  sealed trait easeInQuart
    extends visLib.visMod.EasingFunction
  
  @js.native
  sealed trait easeInQuint
    extends visLib.visMod.EasingFunction
  
  @js.native
  sealed trait easeOutCubic
    extends visLib.visMod.EasingFunction
  
  @js.native
  sealed trait easeOutQuad
    extends visLib.visMod.EasingFunction
  
  @js.native
  sealed trait easeOutQuart
    extends visLib.visMod.EasingFunction
  
  @js.native
  sealed trait easeOutQuint
    extends visLib.visMod.EasingFunction
  
  @js.native
  sealed trait flip extends js.Object
  
  @js.native
  sealed trait from
    extends visLib.visMod.DirectionType
  
  @js.native
  sealed trait `group-label`
    extends visLib.visMod.TimelineEventPropertiesResultWhatType
  
  @js.native
  sealed trait groupDragged
    extends visLib.visMod.TimelineEvents
  
  @js.native
  sealed trait hidePopup
    extends visLib.visMod.NetworkEvents
  
  @js.native
  sealed trait hold
    extends visLib.visMod.NetworkEvents
  
  @js.native
  sealed trait hour
    extends visLib.visMod.TimelineTimeAxisScaleType
  
  @js.native
  sealed trait hoverEdge
    extends visLib.visMod.NetworkEvents
  
  @js.native
  sealed trait hoverNode
    extends visLib.visMod.NetworkEvents
  
  @js.native
  sealed trait initRedraw
    extends visLib.visMod.NetworkEvents
  
  @js.native
  sealed trait item
    extends visLib.visMod.TimelineEventPropertiesResultWhatType
  
  @js.native
  sealed trait itemout
    extends visLib.visMod.TimelineEvents
  
  @js.native
  sealed trait itemover
    extends visLib.visMod.TimelineEvents
  
  @js.native
  sealed trait left
    extends visLib.visMod.Graph2dBarChartAlign
       with visLib.visMod.RightLeftEnumType
       with visLib.visMod.TimelineAlignType
  
  @js.native
  sealed trait line
    extends visLib.visMod.Graph2dStyleType
  
  @js.native
  sealed trait linear
    extends visLib.visMod.EasingFunction
  
  @js.native
  sealed trait millisecond
    extends visLib.visMod.TimelineTimeAxisScaleType
  
  @js.native
  sealed trait minute
    extends visLib.visMod.TimelineTimeAxisScaleType
  
  @js.native
  sealed trait month
    extends visLib.visMod.TimelineTimeAxisScaleType
  
  @js.native
  sealed trait monthly extends js.Object
  
  @js.native
  sealed trait mouseDown
    extends visLib.visMod.TimelineEvents
  
  @js.native
  sealed trait mouseMove
    extends visLib.visMod.TimelineEvents
  
  @js.native
  sealed trait mouseOver
    extends visLib.visMod.TimelineEvents
  
  @js.native
  sealed trait mouseUp
    extends visLib.visMod.TimelineEvents
  
  @js.native
  sealed trait oncontext
    extends visLib.visMod.NetworkEvents
  
  @js.native
  sealed trait point
    extends visLib.visMod.TimelineItemType
  
  @js.native
  sealed trait points
    extends visLib.visMod.Graph2dStyleType
  
  @js.native
  sealed trait range
    extends visLib.visMod.TimelineItemType
  
  @js.native
  sealed trait rangechange
    extends visLib.visMod.TimelineEvents
  
  @js.native
  sealed trait rangechanged
    extends visLib.visMod.TimelineEvents
  
  @js.native
  sealed trait release
    extends visLib.visMod.NetworkEvents
  
  @js.native
  sealed trait resize
    extends visLib.visMod.NetworkEvents
  
  @js.native
  sealed trait right
    extends visLib.visMod.Graph2dBarChartAlign
       with visLib.visMod.RightLeftEnumType
       with visLib.visMod.TimelineAlignType
  
  @js.native
  sealed trait second
    extends visLib.visMod.TimelineTimeAxisScaleType
  
  @js.native
  sealed trait select
    extends visLib.visMod.NetworkEvents
       with visLib.visMod.TimelineEvents
  
  @js.native
  sealed trait selectEdge
    extends visLib.visMod.NetworkEvents
  
  @js.native
  sealed trait selectNode
    extends visLib.visMod.NetworkEvents
  
  @js.native
  sealed trait showPopup
    extends visLib.visMod.NetworkEvents
  
  @js.native
  sealed trait square
    extends visLib.visMod.Graph2dDrawPointsStyle
  
  @js.native
  sealed trait stabilizationIterationsDone
    extends visLib.visMod.NetworkEvents
  
  @js.native
  sealed trait stabilizationProgress
    extends visLib.visMod.NetworkEvents
  
  @js.native
  sealed trait stabilized
    extends visLib.visMod.NetworkEvents
  
  @js.native
  sealed trait startStabilizing
    extends visLib.visMod.NetworkEvents
  
  @js.native
  sealed trait timechange
    extends visLib.visMod.TimelineEvents
  
  @js.native
  sealed trait timechanged
    extends visLib.visMod.TimelineEvents
  
  @js.native
  sealed trait to
    extends visLib.visMod.DirectionType
  
  @js.native
  sealed trait top
    extends visLib.visMod.TopBottomEnumType
  
  @js.native
  sealed trait `top-left`
    extends visLib.visMod.LegendPositionType
  
  @js.native
  sealed trait `top-right`
    extends visLib.visMod.LegendPositionType
  
  @js.native
  sealed trait uniform
    extends visLib.visMod.ParametrizationInterpolationType
  
  @js.native
  sealed trait weekday
    extends visLib.visMod.TimelineTimeAxisScaleType
  
  @js.native
  sealed trait weekly extends js.Object
  
  @js.native
  sealed trait year
    extends visLib.visMod.TimelineTimeAxisScaleType
  
  @js.native
  sealed trait yearly extends js.Object
  
  @js.native
  sealed trait zoom
    extends visLib.visMod.NetworkEvents
  
  @scala.inline
  def Array: Array = "Array".asInstanceOf[Array]
  @scala.inline
  def Object: Object = "Object".asInstanceOf[Object]
  @scala.inline
  def afterDrawing: afterDrawing = "afterDrawing".asInstanceOf[afterDrawing]
  @scala.inline
  def animationFinished: animationFinished = "animationFinished".asInstanceOf[animationFinished]
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  @scala.inline
  def axis: axis = "axis".asInstanceOf[axis]
  @scala.inline
  def background: background = "background".asInstanceOf[background]
  @scala.inline
  def bar: bar = "bar".asInstanceOf[bar]
  @scala.inline
  def beforeDrawing: beforeDrawing = "beforeDrawing".asInstanceOf[beforeDrawing]
  @scala.inline
  def blurEdge: blurEdge = "blurEdge".asInstanceOf[blurEdge]
  @scala.inline
  def blurNode: blurNode = "blurNode".asInstanceOf[blurNode]
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  @scala.inline
  def `bottom-left`: `bottom-left` = "bottom-left".asInstanceOf[`bottom-left`]
  @scala.inline
  def `bottom-right`: `bottom-right` = "bottom-right".asInstanceOf[`bottom-right`]
  @scala.inline
  def box: box = "box".asInstanceOf[box]
  @scala.inline
  def cap: cap = "cap".asInstanceOf[cap]
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  @scala.inline
  def centripetal: centripetal = "centripetal".asInstanceOf[centripetal]
  @scala.inline
  def changed: changed = "changed".asInstanceOf[changed]
  @scala.inline
  def chordal: chordal = "chordal".asInstanceOf[chordal]
  @scala.inline
  def circle: circle = "circle".asInstanceOf[circle]
  @scala.inline
  def click: click = "click".asInstanceOf[click]
  @scala.inline
  def configChange: configChange = "configChange".asInstanceOf[configChange]
  @scala.inline
  def contextmenu: contextmenu = "contextmenu".asInstanceOf[contextmenu]
  @scala.inline
  def `current-time`: `current-time` = "current-time".asInstanceOf[`current-time`]
  @scala.inline
  def currentTimeTick: currentTimeTick = "currentTimeTick".asInstanceOf[currentTimeTick]
  @scala.inline
  def `custom-time`: `custom-time` = "custom-time".asInstanceOf[`custom-time`]
  @scala.inline
  def daily: daily = "daily".asInstanceOf[daily]
  @scala.inline
  def day: day = "day".asInstanceOf[day]
  @scala.inline
  def deselectEdge: deselectEdge = "deselectEdge".asInstanceOf[deselectEdge]
  @scala.inline
  def deselectNode: deselectNode = "deselectNode".asInstanceOf[deselectNode]
  @scala.inline
  def disabled: disabled = "disabled".asInstanceOf[disabled]
  @scala.inline
  def doubleClick: doubleClick = "doubleClick".asInstanceOf[doubleClick]
  @scala.inline
  def dragEnd: dragEnd = "dragEnd".asInstanceOf[dragEnd]
  @scala.inline
  def dragStart: dragStart = "dragStart".asInstanceOf[dragStart]
  @scala.inline
  def dragging: dragging = "dragging".asInstanceOf[dragging]
  @scala.inline
  def drop: drop = "drop".asInstanceOf[drop]
  @scala.inline
  def easeInCubic: easeInCubic = "easeInCubic".asInstanceOf[easeInCubic]
  @scala.inline
  def easeInOutCubic: easeInOutCubic = "easeInOutCubic".asInstanceOf[easeInOutCubic]
  @scala.inline
  def easeInOutQuad: easeInOutQuad = "easeInOutQuad".asInstanceOf[easeInOutQuad]
  @scala.inline
  def easeInOutQuart: easeInOutQuart = "easeInOutQuart".asInstanceOf[easeInOutQuart]
  @scala.inline
  def easeInOutQuint: easeInOutQuint = "easeInOutQuint".asInstanceOf[easeInOutQuint]
  @scala.inline
  def easeInQuad: easeInQuad = "easeInQuad".asInstanceOf[easeInQuad]
  @scala.inline
  def easeInQuart: easeInQuart = "easeInQuart".asInstanceOf[easeInQuart]
  @scala.inline
  def easeInQuint: easeInQuint = "easeInQuint".asInstanceOf[easeInQuint]
  @scala.inline
  def easeOutCubic: easeOutCubic = "easeOutCubic".asInstanceOf[easeOutCubic]
  @scala.inline
  def easeOutQuad: easeOutQuad = "easeOutQuad".asInstanceOf[easeOutQuad]
  @scala.inline
  def easeOutQuart: easeOutQuart = "easeOutQuart".asInstanceOf[easeOutQuart]
  @scala.inline
  def easeOutQuint: easeOutQuint = "easeOutQuint".asInstanceOf[easeOutQuint]
  @scala.inline
  def flip: flip = "flip".asInstanceOf[flip]
  @scala.inline
  def from: from = "from".asInstanceOf[from]
  @scala.inline
  def `group-label`: `group-label` = "group-label".asInstanceOf[`group-label`]
  @scala.inline
  def groupDragged: groupDragged = "groupDragged".asInstanceOf[groupDragged]
  @scala.inline
  def hidePopup: hidePopup = "hidePopup".asInstanceOf[hidePopup]
  @scala.inline
  def hold: hold = "hold".asInstanceOf[hold]
  @scala.inline
  def hour: hour = "hour".asInstanceOf[hour]
  @scala.inline
  def hoverEdge: hoverEdge = "hoverEdge".asInstanceOf[hoverEdge]
  @scala.inline
  def hoverNode: hoverNode = "hoverNode".asInstanceOf[hoverNode]
  @scala.inline
  def initRedraw: initRedraw = "initRedraw".asInstanceOf[initRedraw]
  @scala.inline
  def item: item = "item".asInstanceOf[item]
  @scala.inline
  def itemout: itemout = "itemout".asInstanceOf[itemout]
  @scala.inline
  def itemover: itemover = "itemover".asInstanceOf[itemover]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def line: line = "line".asInstanceOf[line]
  @scala.inline
  def linear: linear = "linear".asInstanceOf[linear]
  @scala.inline
  def millisecond: millisecond = "millisecond".asInstanceOf[millisecond]
  @scala.inline
  def minute: minute = "minute".asInstanceOf[minute]
  @scala.inline
  def month: month = "month".asInstanceOf[month]
  @scala.inline
  def monthly: monthly = "monthly".asInstanceOf[monthly]
  @scala.inline
  def mouseDown: mouseDown = "mouseDown".asInstanceOf[mouseDown]
  @scala.inline
  def mouseMove: mouseMove = "mouseMove".asInstanceOf[mouseMove]
  @scala.inline
  def mouseOver: mouseOver = "mouseOver".asInstanceOf[mouseOver]
  @scala.inline
  def mouseUp: mouseUp = "mouseUp".asInstanceOf[mouseUp]
  @scala.inline
  def oncontext: oncontext = "oncontext".asInstanceOf[oncontext]
  @scala.inline
  def point: point = "point".asInstanceOf[point]
  @scala.inline
  def points: points = "points".asInstanceOf[points]
  @scala.inline
  def range: range = "range".asInstanceOf[range]
  @scala.inline
  def rangechange: rangechange = "rangechange".asInstanceOf[rangechange]
  @scala.inline
  def rangechanged: rangechanged = "rangechanged".asInstanceOf[rangechanged]
  @scala.inline
  def release: release = "release".asInstanceOf[release]
  @scala.inline
  def resize: resize = "resize".asInstanceOf[resize]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def second: second = "second".asInstanceOf[second]
  @scala.inline
  def select: select = "select".asInstanceOf[select]
  @scala.inline
  def selectEdge: selectEdge = "selectEdge".asInstanceOf[selectEdge]
  @scala.inline
  def selectNode: selectNode = "selectNode".asInstanceOf[selectNode]
  @scala.inline
  def showPopup: showPopup = "showPopup".asInstanceOf[showPopup]
  @scala.inline
  def square: square = "square".asInstanceOf[square]
  @scala.inline
  def stabilizationIterationsDone: stabilizationIterationsDone = "stabilizationIterationsDone".asInstanceOf[stabilizationIterationsDone]
  @scala.inline
  def stabilizationProgress: stabilizationProgress = "stabilizationProgress".asInstanceOf[stabilizationProgress]
  @scala.inline
  def stabilized: stabilized = "stabilized".asInstanceOf[stabilized]
  @scala.inline
  def startStabilizing: startStabilizing = "startStabilizing".asInstanceOf[startStabilizing]
  @scala.inline
  def timechange: timechange = "timechange".asInstanceOf[timechange]
  @scala.inline
  def timechanged: timechanged = "timechanged".asInstanceOf[timechanged]
  @scala.inline
  def to: to = "to".asInstanceOf[to]
  @scala.inline
  def top: top = "top".asInstanceOf[top]
  @scala.inline
  def `top-left`: `top-left` = "top-left".asInstanceOf[`top-left`]
  @scala.inline
  def `top-right`: `top-right` = "top-right".asInstanceOf[`top-right`]
  @scala.inline
  def uniform: uniform = "uniform".asInstanceOf[uniform]
  @scala.inline
  def weekday: weekday = "weekday".asInstanceOf[weekday]
  @scala.inline
  def weekly: weekly = "weekly".asInstanceOf[weekly]
  @scala.inline
  def year: year = "year".asInstanceOf[year]
  @scala.inline
  def yearly: yearly = "yearly".asInstanceOf[yearly]
  @scala.inline
  def zoom: zoom = "zoom".asInstanceOf[zoom]
}

