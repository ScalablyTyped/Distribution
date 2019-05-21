organization := "org.scalablytyped"
name := "svg-sprite"
version := "0.0-unknown-dt-20190322Z-3e7375"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-ee44c5",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190517Z-07594f",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-b0a159",
  "org.scalablytyped" %%% "winston" % "3.2.1-519aca",
  "org.scalablytyped" %%% "winston-transport" % "4.3.0-7bb423")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        