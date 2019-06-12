organization := "org.scalablytyped"
name := "webcola"
version := "3.4.0-484de6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20190212Z-e4eb68",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20190212Z-acd207",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190212Z-a5fa27",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20190212Z-3085c7",
  "org.scalablytyped" %%% "std" % "3.5-c5d119")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        