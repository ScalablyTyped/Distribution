organization := "org.scalablytyped"
name := "superagent-bunyan"
version := "5.2-dt-20190703Z-5f5c58"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-04ae87",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-960f59",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-51871a",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20191028Z-76d948")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        