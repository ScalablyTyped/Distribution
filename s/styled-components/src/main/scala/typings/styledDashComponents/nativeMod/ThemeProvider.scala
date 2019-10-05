package typings.styledDashComponents.nativeMod

import org.scalablytyped.runtime.TopLevel
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentState
import typings.styledDashComponents.styledDashComponentsMod.DefaultTheme
import typings.styledDashComponents.styledDashComponentsMod.ThemeProviderComponent
import typings.styledDashComponents.styledDashComponentsMod.ThemeProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("styled-components/native", "ThemeProvider")
@js.native
class ThemeProvider protected ()
  extends Component[
      ThemeProviderProps[
        typings.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[typings.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[DefaultTheme]], 
        typings.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[typings.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[DefaultTheme]]
      ], 
      ComponentState, 
      js.Any
    ] {
  def this(props: ThemeProviderProps[
        typings.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[typings.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[DefaultTheme]], 
        typings.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[typings.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[DefaultTheme]]
      ]) = this()
  def this(
    props: ThemeProviderProps[
        typings.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[typings.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[DefaultTheme]], 
        typings.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[typings.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[DefaultTheme]]
      ],
    context: js.Any
  ) = this()
}

@JSImport("styled-components/native", "ThemeProvider")
@js.native
object ThemeProvider
  extends TopLevel[
      ThemeProviderComponent[
        typings.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[DefaultTheme], 
        typings.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[DefaultTheme]
      ]
    ]

