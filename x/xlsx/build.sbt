organization := "org.scalablytyped"
name := "xlsx"
version := "0.14.1-ed1c6f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "adler-32" % "1.2.0-fa4ef1",
  "org.scalablytyped" %%% "cfb" % "1.1.0-fb3b5f",
  "org.scalablytyped" %%% "codepage" % "1.14.0-be2079",
  "org.scalablytyped" %%% "commander" % "2.19.0-776db8",
  "org.scalablytyped" %%% "crc-32" % "1.2.0-9bec2b",
  "org.scalablytyped" %%% "frac" % "1.1.2-b93115",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190311Z-8b4969",
  "org.scalablytyped" %%% "printj" % "1.1.2-5c0090",
  "org.scalablytyped" %%% "ssf" % "0.10.2-ba7851",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        